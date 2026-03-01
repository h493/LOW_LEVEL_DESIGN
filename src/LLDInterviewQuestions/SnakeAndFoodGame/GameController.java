package LLDInterviewQuestions.SnakeAndFoodGame;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GameController {

    public static void main(String[] args) {

        // 1️⃣ Create Food List
        List<FoodItem> foods = new ArrayList<>();

        foods.add(FoodFactory.createFood(new Position(1, 2), "normal"));

        foods.add(FoodFactory.createFood(new Position(2, 2), "bonus"));

        // 2️⃣ Create Game (Inject Strategy)
        SnakeGame game = new SnakeGame(5, 5, foods, new HumanMovementStrategy());

        // 3️⃣ Start Game Loop
        Scanner scanner = new Scanner(System.in);
        DIRECTION currentDirection = DIRECTION.R;

        System.out.println("Snake Game Started!");
        System.out.println("Enter direction: U, D, L, R");

        while (true) {

            String input = scanner.nextLine().toUpperCase();

            try {
                DIRECTION newDirection = DIRECTION.valueOf(input);

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

        scanner.close();
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
