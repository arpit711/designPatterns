package abstractFactoryPattern;

public class USAVehicleFactory implements VehicleFactory {
    @Override
    public Car createCar() {
        return new USACar();
    }

    @Override
    public Bike CreateBike() {
        return new USABike();
    }
}
