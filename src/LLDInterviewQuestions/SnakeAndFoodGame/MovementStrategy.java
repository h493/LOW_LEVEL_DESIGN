package LLDInterviewQuestions.SnakeAndFoodGame;

public interface MovementStrategy {
    Position getNextPosition(Position currentHead, DIRECTION direction);
}
