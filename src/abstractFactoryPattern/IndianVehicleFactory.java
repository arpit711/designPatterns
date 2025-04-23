package abstractFactoryPattern;

public class IndianVehicleFactory implements VehicleFactory {
    @Override
    public Car createCar() {
        return new IndianCar();
    }

    @Override
    public Bike CreateBike() {
        return new IndianBike();
    }
}
