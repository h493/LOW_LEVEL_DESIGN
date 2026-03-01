package LLDInterviewQuestions.SnakeAndFoodGame;

//will have the single instance of board through out the game
public class Board {
    public static Board instance;
    private final int height;
    private final int width;

    private Board(int height, int width){
        this.height = height;
        this.width = width;
    }

    public static Board getBoard(int height, int width){
        if(instance == null){
            instance = new Board(height, width);
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
