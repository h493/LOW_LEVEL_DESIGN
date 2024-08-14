package INTERVIEW_QUESTION.DesignATM.ATMStates;

import INTERVIEW_QUESTION.DesignATM.ATM;
import INTERVIEW_QUESTION.DesignATM.Card;
import INTERVIEW_QUESTION.DesignATM.TransactionType;

public class SelectOperationState extends ATMState{

    public SelectOperationState(){
        showOperations();
    }

    @Override
    public void selectOperation(ATM atm, Card card, TransactionType txType){

        switch (txType){

            case BALANCE_CHECK :
                atm.setCurrentState(new CheckBalanceState());
                break;
            case CASH_WITHDRAWAL:
                atm.setCurrentState(new CashWithdrawalState());
                break;
            default:
                System.out.println("Invalid Operation");
                exit(atm);
        }
    }

    @Override
    public void exit(ATM atmObject){
        returnCard();
        atmObject.setCurrentState(new IdleState());
        System.out.println("Exit happens");
    }

    @Override
    public void returnCard(){
        System.out.println("Please collect your card");
    }

    private void showOperations(){
        System.out.println("Please select the operations");
        TransactionType.showAllTransactionTypes();
    }
}
