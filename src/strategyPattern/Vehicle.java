package strategyPattern;

import strategyPattern.strategy.DriveStrategy;

public class Vehicle {
    DriveStrategy driveObject;

//  example of Constructor Injection Important Learning Topic.
    public Vehicle(DriveStrategy driveObject) {
        this.driveObject = driveObject;
    }

    public void drive() {
        driveObject.drive();
    }
}
