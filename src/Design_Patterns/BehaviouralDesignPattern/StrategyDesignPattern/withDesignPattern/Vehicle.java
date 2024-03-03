package Design_Patterns.BehaviouralDesignPattern.StrategyDesignPattern.withDesignPattern;

import Design_Patterns.BehaviouralDesignPattern.StrategyDesignPattern.withDesignPattern.Strategy.DriveStrategy;

public class Vehicle {

    private DriveStrategy driveStrategy;

    Vehicle(DriveStrategy driveStrategy){
        this.driveStrategy = driveStrategy;
    }

    public void drive(){
        driveStrategy.drive();
    }

}
