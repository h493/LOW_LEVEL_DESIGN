package Design_Patterns.StructuralDesignPattern.FlyWeightPattern.RobotGame;

public class HumanoidRobot implements IRobot{

    private String type;
    private Sprites body; //small 2d bitmap (graphic element)

    HumanoidRobot(String type, Sprites body){
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
        //use the humanoid sprites object
        // and X and Y coordinate to render the image.
    }
}
