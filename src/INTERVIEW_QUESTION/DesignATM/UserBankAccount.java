package INTERVIEW_QUESTION.DesignATM;

public class UserBankAccount {
    int balance;

    public void withDrawBalance(int amount){
        balance = balance - amount;
    }
}
