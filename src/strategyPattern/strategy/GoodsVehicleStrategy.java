package strategyPattern.strategy;

public class GoodsVehicleStrategy implements DriveStrategy {

    @Override
    public void drive() {
        System.out.println("Gooods vehicle Strategy");
    }
}
