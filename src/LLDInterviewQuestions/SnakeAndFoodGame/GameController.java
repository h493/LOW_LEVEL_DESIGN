package LLDInterviewQuestions.SnakeAndFoodGame;

import LLDInterviewQuestions.SnakeAndFoodGame.Food.FoodFactory;
import LLDInterviewQuestions.SnakeAndFoodGame.Food.FoodItem;
import LLDInterviewQuestions.SnakeAndFoodGame.Input.ConsoleInputProvider;
import LLDInterviewQuestions.SnakeAndFoodGame.Input.InputProvider;
import LLDInterviewQuestions.SnakeAndFoodGame.MovementStrategy.HumanMovementStrategy;

import java.util.ArrayList;
import java.util.List;

public class GameController {

    public static void main(String[] args) {

        // 1️⃣ Create Food List
        List<FoodItem> foods = new ArrayList<>();

        foods.add(FoodFactory.createFood(new Position(1, 2), "normal"));

        foods.add(FoodFactory.createFood(new Position(2, 2), "bonus"));

        // 2️⃣ Create Game (Inject Strategy)
        SnakeGame game = new SnakeGame(5, 5, foods, new HumanMovementStrategy());

        // 3️⃣ Start Game Loop
        System.out.println("Snake Game Started!");
        System.out.println("Enter direction: U, D, L, R");

        InputProvider inputProvider = new ConsoleInputProvider();
        while (true) {

            try {
                DIRECTION newDirection = inputProvider.getNextDirection();

                int result = game.move(newDirection);

                if (result == -1) {
                    System.out.println("Game Over!");
                    break;
                }

                System.out.println("Score: " + result);

            } catch (IllegalArgumentException e) {
                System.out.println("Invalid Direction! Use U, D, L, R");
            }
        }
    }
}

/**
 *
 * Key-Requirement :
 * 1. A game grid with specific height and width
 * 2. A single snake entity , controlled by the player
 * 3. Food objects that appear in the predefined positions on the grid
 * 4. Collision Detection for both walls and snake body
 * 5. Movement mechanics and snake growth
 * 6. Scoring mechanism based on food consumption
 *
 *
 *
 *
 */
