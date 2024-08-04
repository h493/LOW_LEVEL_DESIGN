package INTERVIEW_QUESTION.SPLITWISE.Expense;

import INTERVIEW_QUESTION.SPLITWISE.Expense.Split.EqualExpenseSplit;
import INTERVIEW_QUESTION.SPLITWISE.Expense.Split.ExpenseSplit;
import INTERVIEW_QUESTION.SPLITWISE.Expense.Split.PercentageExpenseSplit;
import INTERVIEW_QUESTION.SPLITWISE.Expense.Split.UnequalExpenseSplit;

public class SplitFactory {

    public static ExpenseSplit getSplitObject(ExpenseSplitType SplitType){

        switch (SplitType){
            case EQUAL :
                return new EqualExpenseSplit();
            case UNEQUAL:
                return new UnequalExpenseSplit();
            case PERCENTAGE:
                return new PercentageExpenseSplit();
            default:
                return null;
        }

    }
}
