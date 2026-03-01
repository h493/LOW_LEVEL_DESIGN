package LLDInterviewQuestions.SnakeAndFoodGame;

public class HumanMovementStrategy implements MovementStrategy{
    @Override
    public Position getNextPosition(Position currentHead, DIRECTION direction) {
        int row = currentHead.getRow();
        int col = currentHead.getCol();

        return switch (direction) {
            case U -> new Position(row - 1, col);
            case D -> new Position(row + 1, col);
            case L -> new Position(row, col - 1);
            case R -> new Position(row, col + 1);
            default -> throw new IllegalArgumentException("Invalid direction : " + direction);
        };
    }
}
