package LLDInterviewQuestions.SnakeAndFoodGame.Board;

import LLDInterviewQuestions.SnakeAndFoodGame.Position;

public class InfiniteBoard implements Board {

    @Override
    public boolean isOutOfBounds(Position position) {
        return false; // no boundaries
    }
}
