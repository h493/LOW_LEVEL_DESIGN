package Design_Patterns.BehaviouralDesignPattern.StrategyDesignPattern.withDesignPattern.Strategy;

public class NormalDriveStrategy implements DriveStrategy{
    @Override
    public void drive() {
        System.out.println("Normal drive capablities");
    }
}
