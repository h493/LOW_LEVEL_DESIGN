package Design_Patterns.BehaviouralDesignPattern.StrategyDesignPattern.withDesignPattern;

import Design_Patterns.BehaviouralDesignPattern.StrategyDesignPattern.withDesignPattern.Strategy.SportsDriveStrategy;

public class sportsVehicle extends Vehicle{
    sportsVehicle() {
        super(new SportsDriveStrategy());
    }
}
