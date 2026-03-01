package LLDInterviewQuestions.SnakeAndFoodGame.MovementStrategy;

import LLDInterviewQuestions.SnakeAndFoodGame.DIRECTION;
import LLDInterviewQuestions.SnakeAndFoodGame.Position;

public interface MovementStrategy {
    Position getNextPosition(Position currentHead, DIRECTION direction);
}
