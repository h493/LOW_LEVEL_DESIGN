package LLDInterviewQuestions.SnakeAndFoodGame.Board;

import LLDInterviewQuestions.SnakeAndFoodGame.Position;

//will have the single instance of board through out the game
public class FiniteBoard {
    public static FiniteBoard instance;
    private final int height;
    private final int width;

    private FiniteBoard(int height, int width){
        this.height = height;
        this.width = width;
    }

    public static FiniteBoard getBoard(int height, int width){
        if(instance == null){
            instance = new FiniteBoard(height, width);
        }
        return instance;
    }

    public boolean isOutOfBounds(Position position) {
        return position.getRow() < 0 ||
                position.getRow() >= height ||
                position.getCol() < 0 ||
                position.getCol() >= width;
    }
}
