package INTERVIEW_QUESTION.SPLITWISE.User;

import INTERVIEW_QUESTION.SPLITWISE.UserExpenseBalanceSheet;

public class User {

    String userId;
    String userName;
    UserExpenseBalanceSheet userExpenseBalanceSheet;

    public User(String userId, String userName, UserExpenseBalanceSheet userExpenseBalanceSheet) {
        this.userId = userId;
        this.userName = userName;
        this.userExpenseBalanceSheet = userExpenseBalanceSheet;
    }

    public  User(String userId, String userName){
        this.userId = userId;
        this.userName = userName;
    }

    public String getUserId() {
        return userId;
    }



    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public UserExpenseBalanceSheet getUserExpenseBalanceSheet() {
        return userExpenseBalanceSheet;
    }

}
