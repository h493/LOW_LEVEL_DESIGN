package Design_Patterns.BehaviouralDesignPattern.StrategyDesignPattern.withDesignPattern;

import Design_Patterns.BehaviouralDesignPattern.StrategyDesignPattern.withDesignPattern.Strategy.NormalDriveStrategy;

public class OffRoadVehicle extends Vehicle{
    OffRoadVehicle() {
        super(new NormalDriveStrategy());
    }
}
