package factoryDesignPattern;

public class FactoryDemoClass {
    public static void main(String[] args) {
        Vehicle vehicle = VehicleFactory.getVehicleFromFactory("car");
        vehicle.runEngine();
    }
}
