package Design_Patterns.StrategyDesignPattern.withDesignPattern;

import Design_Patterns.StrategyDesignPattern.withDesignPattern.Strategy.DriveStrategy;
import Design_Patterns.StrategyDesignPattern.withDesignPattern.Strategy.SportsDriveStrategy;

public class sportsVehicle extends Vehicle{
    sportsVehicle() {
        super(new SportsDriveStrategy());
    }
}
