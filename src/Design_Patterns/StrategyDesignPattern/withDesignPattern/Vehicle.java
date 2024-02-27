package Design_Patterns.StrategyDesignPattern.withDesignPattern;

import Design_Patterns.StrategyDesignPattern.withDesignPattern.Strategy.DriveStrategy;

public class Vehicle {

    private DriveStrategy driveStrategy;

    Vehicle(DriveStrategy driveStrategy){
        this.driveStrategy = driveStrategy;
    }

    public void drive(){
        driveStrategy.drive();
    }

}
