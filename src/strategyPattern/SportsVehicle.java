package strategyPattern;

import strategyPattern.strategy.DriveStrategy;
import strategyPattern.strategy.SportsVehicleStrategy;

public class SportsVehicle extends Vehicle {
    public SportsVehicle() {
        super(new SportsVehicleStrategy());
    }
}
