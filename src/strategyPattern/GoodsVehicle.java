package strategyPattern;

import strategyPattern.strategy.GoodsVehicleStrategy;

public class GoodsVehicle extends Vehicle {
    public GoodsVehicle() {
        super(new GoodsVehicleStrategy());
    }
}
