package LLDInterviewQuestions.SnakeAndFoodGame;

import LLDInterviewQuestions.SnakeAndFoodGame.Board.FiniteBoard;
import LLDInterviewQuestions.SnakeAndFoodGame.Food.FoodItem;
import LLDInterviewQuestions.SnakeAndFoodGame.MovementStrategy.MovementStrategy;

import java.util.List;

public class SnakeGame {
    Snake snake;
    List<FoodItem> foods;
    int score;
    FiniteBoard finiteBoard;
    MovementStrategy movementStrategy;

    public SnakeGame(int height, int width, List<FoodItem> foodItems, MovementStrategy movementStrategy) {
        this.finiteBoard = FiniteBoard.getBoard(height, width);
        this.snake = new Snake();
        this.foods = foodItems;
        this.score = 0;
        this.movementStrategy = movementStrategy;
    }

    public int move(DIRECTION direction) {

        Position currentHead = snake.getHead();
        DIRECTION currentDirection = snake.getCurrentDirection();

        if (isReverseDirection(direction, currentDirection)) {
            direction = currentDirection; // ignore reverse input
        }

        Position nextPosition = movementStrategy.getNextPosition(currentHead, direction);

        if (finiteBoard.isOutOfBounds(nextPosition)) {
            return -1;
        }

        FoodItem eaten = findFood(nextPosition);
        boolean grow = eaten != null;

        if (!snake.moveTo(nextPosition, grow)) {
            return -1;
        }

        if (grow) {
            score += eaten.getScore();
            foods.remove(eaten);
        }

        return score;
    }

    private FoodItem findFood(Position position) {

        for (FoodItem food : foods) {
            if (food.getPosition().equals(position)) {
                return food;
            }
        }

        return null;
    }

    private boolean isReverseDirection(DIRECTION newDirection, DIRECTION currentDirection) {
        return newDirection.isOpposite(currentDirection);
    }

}
