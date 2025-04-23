package factoryDesignPattern;

class VehicleFactory {
    public static Vehicle getVehicleFromFactory(String type) {
        if (type.equals("car")) {
            return new Car();
        } else if (type.equals("bike")) return new Bike();
        return null;
    }
}
