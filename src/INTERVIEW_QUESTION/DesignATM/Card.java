package INTERVIEW_QUESTION.DesignATM;

import java.util.Date;

public class Card {
    private int cardNumber;
    private int cvv;
    private Date expiryDate;
    private String holderName;
    static int PIN_NUMBER = 112211;
    private UserBankAccount bankAccount;

    public boolean isCorrectPINEntered(int pin){
        return pin == PIN_NUMBER;
    }

    public int getBankBalance(){
        return bankAccount.balance;
    }

    public void deductBankBalance(int amount){
        bankAccount.withDrawBalance(amount);
    }

    public void setBankAccount(UserBankAccount bankAccount){
        this.bankAccount = bankAccount;
    }
}
