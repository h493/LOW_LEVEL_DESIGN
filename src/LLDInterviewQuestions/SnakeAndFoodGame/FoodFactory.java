package LLDInterviewQuestions.SnakeAndFoodGame;

public class FoodFactory {
    // static method to create a food item at a given Position
    public static FoodItem createFood(Position position, String type){
        if ("bonus".equalsIgnoreCase(type)) {
            return new BonusFood(position);
        }
        return new NormalFood(position);
    }
}
