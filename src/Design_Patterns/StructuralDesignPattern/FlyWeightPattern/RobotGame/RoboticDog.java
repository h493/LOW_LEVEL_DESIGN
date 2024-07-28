package Design_Patterns.StructuralDesignPattern.FlyWeightPattern.RobotGame;

public class RoboticDog implements IRobot{
    private String type;
    private Sprites body; //small 2d bitmap (graphic element)

    RoboticDog(String type, Sprites body){
        this.type = type;
        this.body = body;
    }

    //No setter -> bcz we want immutable Intrinsic shared data
    public String getType() {
        return type;
    }

    public Sprites getBody() {
        return body;
    }
    @Override
    public void display(int x, int y) {

    }
}
