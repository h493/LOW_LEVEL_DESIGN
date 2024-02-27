package Design_Patterns.StrategyDesignPattern.withDesignPattern;

import Design_Patterns.StrategyDesignPattern.withDesignPattern.Strategy.DriveStrategy;
import Design_Patterns.StrategyDesignPattern.withDesignPattern.Strategy.NormalDriveStrategy;

public class OffRoadVehicle extends Vehicle{
    OffRoadVehicle() {
        super(new NormalDriveStrategy());
    }
}
