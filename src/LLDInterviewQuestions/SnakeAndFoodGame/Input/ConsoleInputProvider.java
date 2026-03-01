package LLDInterviewQuestions.SnakeAndFoodGame.Input;

import LLDInterviewQuestions.SnakeAndFoodGame.DIRECTION;

import java.util.Scanner;

public class ConsoleInputProvider implements InputProvider {
    private final Scanner scanner = new Scanner(System.in);

    @Override
    public DIRECTION getNextDirection() {
        return DIRECTION.valueOf(
                scanner.nextLine().toUpperCase()
        );
    }
}
