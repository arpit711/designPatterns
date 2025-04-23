package abstractFactoryPattern;

public class AbstractFactoryDemo {
    public static void main(String[] args) {
        VehicleFactory factory = new IndianVehicleFactory();
        factory.createCar().run();
        factory.CreateBike().run();
    }
}
