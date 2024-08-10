package INTERVIEW_QUESTION.TICTACTOE;

public class Main {
    public static void main(String[] args) {
        TicTacToeGame game = new TicTacToeGame();
        game.initializeGame();
        System.out.println("Game winner is: " + game.startGame());
    }
}
