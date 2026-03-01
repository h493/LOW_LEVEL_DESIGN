package LLDInterviewQuestions.SnakeAndFoodGame.MovementStrategy;

import LLDInterviewQuestions.SnakeAndFoodGame.DIRECTION;
import LLDInterviewQuestions.SnakeAndFoodGame.Position;

public class AIMovementStrategy implements MovementStrategy {
    @Override
    public Position getNextPosition(Position currentHead, DIRECTION direction) {
        return currentHead;
    }
}
