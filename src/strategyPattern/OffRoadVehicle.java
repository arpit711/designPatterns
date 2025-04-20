package strategyPattern;

import strategyPattern.strategy.DriveStrategy;
import strategyPattern.strategy.OffRoadVehicleStrategy;

public class OffRoadVehicle extends Vehicle {

    public OffRoadVehicle() {
        super(new OffRoadVehicleStrategy());
    }
}
