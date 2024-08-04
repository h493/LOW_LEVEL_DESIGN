package INTERVIEW_QUESTION.SPLITWISE.Expense;

import INTERVIEW_QUESTION.SPLITWISE.BalanceSheetController;
import INTERVIEW_QUESTION.SPLITWISE.Expense.Split.ExpenseSplit;
import INTERVIEW_QUESTION.SPLITWISE.Expense.Split.Split;
import INTERVIEW_QUESTION.SPLITWISE.User.User;

import java.util.List;

public class ExpenseController {

    BalanceSheetController balanceSheetController;
    public ExpenseController(){
        balanceSheetController = new BalanceSheetController();
    }

    public Expense createExpense(String expenseId, String description, double expenseAmount,
                                 List<Split> splitDetails, ExpenseSplitType splitType, User paidByUser){

        ExpenseSplit expenseSplit = SplitFactory.getSplitObject(splitType);
        expenseSplit.validateSplitRequest(splitDetails, expenseAmount);

        Expense expense = new Expense(expenseId, description, expenseAmount, paidByUser, splitType, splitDetails);
        balanceSheetController.updateUserExpenseBalanceSheet(paidByUser, splitDetails, expenseAmount);

        return expense;

    }
}
