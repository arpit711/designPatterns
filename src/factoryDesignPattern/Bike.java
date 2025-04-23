package factoryDesignPattern;

public class Bike implements Vehicle {
    @Override
    public void runEngine() {
        System.out.println("Bike Engine");
    }
}
