package INTERVIEW_QUESTION.DesignATM.ATMStates;

import INTERVIEW_QUESTION.DesignATM.ATM;
import INTERVIEW_QUESTION.DesignATM.Card;

public class IdleState extends ATMState {

    @Override
    public void insertCard(ATM atm, Card card){
        System.out.println("Card is inserted");
        atm.setCurrentState(new HasCardState());
    }
}
