package Design_Patterns.StructuralDesignPattern.FlyWeightPattern.RobotGame;

public class Main {

    public static void main(String[] args) {

        IRobot humanoidRobot1 = RoboticFactory.createRobot(Constants.HUMANOID);
        humanoidRobot1.display(1,2);

        IRobot humanoidRobot2 = RoboticFactory.createRobot(Constants.HUMANOID);
        humanoidRobot1.display(1,4);

        IRobot roboDog1 = RoboticFactory.createRobot("ROBOTICDOG");
        roboDog1.display(2,9);

        IRobot roboDog2 = RoboticFactory.createRobot("ROBOTICDOG");
        roboDog2.display(11,19);

    }
}
