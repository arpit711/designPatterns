package strategyPattern.strategy;

public class OffRoadVehicleStrategy implements DriveStrategy {

    @Override
    public void drive() {
        System.out.println("OffRoadVehicleStrategy");
    }
}
