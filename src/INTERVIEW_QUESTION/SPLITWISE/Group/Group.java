package INTERVIEW_QUESTION.SPLITWISE.Group;

import INTERVIEW_QUESTION.SPLITWISE.Expense.Expense;
import INTERVIEW_QUESTION.SPLITWISE.Expense.ExpenseController;
import INTERVIEW_QUESTION.SPLITWISE.Expense.ExpenseSplitType;
import INTERVIEW_QUESTION.SPLITWISE.Expense.Split.Split;
import INTERVIEW_QUESTION.SPLITWISE.User.User;

import java.util.ArrayList;
import java.util.List;

public class Group {
    String groupId;
    String groupName;
    List<User> groupMembers;

    List<Expense> expenseList;
    ExpenseController expenseController;

    Group(){
        groupMembers = new ArrayList<>();
        expenseList = new ArrayList<>();
        expenseController = new ExpenseController();
    }

    //add member to group
    public void addMember(User member){
        groupMembers.add(member);
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public Expense createExpense(String expenseId, String description, double expenseAmount,
                                 List<Split> splitDetails, ExpenseSplitType splitType, User paidByUser) {

        Expense expense = expenseController.createExpense(expenseId, description, expenseAmount, splitDetails, splitType, paidByUser);
        expenseList.add(expense);
        return expense;
    }

}
