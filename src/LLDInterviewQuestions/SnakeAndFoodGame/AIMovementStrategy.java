package LLDInterviewQuestions.SnakeAndFoodGame;

public class AIMovementStrategy implements MovementStrategy{
    @Override
    public Position getNextPosition(Position currentHead, DIRECTION direction) {
        return currentHead;
    }
}
