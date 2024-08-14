package INTERVIEW_QUESTION.DesignATM.ATMStates;

import INTERVIEW_QUESTION.DesignATM.ATM;
import INTERVIEW_QUESTION.DesignATM.Card;

public class HasCardState extends ATMState{

    public HasCardState(){
        System.out.println("Enter your card pin number");
    }

    @Override
    public void authenticatePin(ATM atm, Card card, int pin){
        boolean isCorrectPinEntered = card.isCorrectPINEntered(pin);

        if(isCorrectPinEntered){
            atm.setCurrentState(new SelectOperationState());
        }else{
            System.out.println("Invalid PIN Number");
            exit(atm);
        }
    }

    @Override
    public void exit(ATM atm){
        returnCard();
        atm.setCurrentState(new IdleState());
        System.out.println("Exit happens");
    }

    @Override
    public void returnCard(){
        System.out.println("Please collect your card");
    }
}
