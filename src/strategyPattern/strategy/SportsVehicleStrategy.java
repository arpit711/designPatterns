package strategyPattern.strategy;

public class SportsVehicleStrategy implements DriveStrategy {
    @Override
    public void drive() {
        System.out.println("SportsVehicleStrategy");
    }
}
