package Design_Patterns.BehaviouralDesignPattern.StrategyDesignPattern.withDesignPattern.Strategy;

public class SportsDriveStrategy implements DriveStrategy{
    @Override
    public void drive() {
        System.out.println("Special Drive capablities");
    }
}
