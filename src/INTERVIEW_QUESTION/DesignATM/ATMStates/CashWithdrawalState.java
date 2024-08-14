package INTERVIEW_QUESTION.DesignATM.ATMStates;

import INTERVIEW_QUESTION.DesignATM.ATM;
import INTERVIEW_QUESTION.DesignATM.ATMWithdrawal.CashWithdrawProcessor;
import INTERVIEW_QUESTION.DesignATM.ATMWithdrawal.FiveHundredWithdrawProcessor;
import INTERVIEW_QUESTION.DesignATM.ATMWithdrawal.OneHundredWithdrawProcessor;
import INTERVIEW_QUESTION.DesignATM.ATMWithdrawal.TwoThousandWithdrawProcessor;
import INTERVIEW_QUESTION.DesignATM.Card;

public class CashWithdrawalState extends ATMState{

    public CashWithdrawalState(){
        System.out.println("Please enter the Withdrawal amount");
    }

    @Override
    public void cashWithdrawal(ATM atm, Card card, int withdrawalAmount){

        if(atm.getAtmBalance() < withdrawalAmount){
            System.out.println("Insufficient fund in the ATM Machine");
            exit(atm);
        }else if(card.getBankBalance() < withdrawalAmount){
            System.out.println("Insufficient funds in your Bank Account");
            exit(atm);
        }else {

            card.deductBankBalance(withdrawalAmount);
            atm.deductATMBalance(withdrawalAmount);

            //using chain of responsibility for this logic, how many 2k Rs notes, how many 500 Rs notes etc, has to be withdrawal
            CashWithdrawProcessor withdrawProcessor =
                    new TwoThousandWithdrawProcessor(new FiveHundredWithdrawProcessor(new OneHundredWithdrawProcessor(null)));

            withdrawProcessor.withdraw(atm, withdrawalAmount);
            exit(atm);
        }
    }

    @Override
    public void exit(ATM atmObject) {
        returnCard();
        atmObject.setCurrentState(new IdleState());
        System.out.println("Exit happens");
    }

    @Override
    public void returnCard() {
        System.out.println("Please collect your card");
    }

}
