package LLDInterviewQuestions.SnakeAndFoodGame;

public enum DIRECTION {
    L,R,U,D;

    public boolean isOpposite(DIRECTION other) {
        return (this == L && other == R) ||
                (this == R && other == L) ||
                (this == U && other == D) ||
                (this == D && other == U);
    }
}
