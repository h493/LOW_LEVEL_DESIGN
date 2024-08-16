package INTERVIEW_QUESTION.DesignCricbuzz;

public class T20MatchType implements MatchType{

    @Override
    public int noOfOvers() {
        return 20;
    }

    @Override
    public int maxOverCountBowlers() {
        return 4;
    }
}
