package LLDInterviewQuestions.SnakeAndFoodGame;

public abstract class FoodItem {
    protected Position position;
    protected int score;

    FoodItem(Position position, int score){
        this.position = position;
        this.score = score;
    }

    public int getScore(){
        return score;
    }

    public Position getPosition(){
        return position;
    }
}
