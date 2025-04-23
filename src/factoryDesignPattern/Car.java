package factoryDesignPattern;

class Car implements Vehicle {

    @Override
    public void runEngine() {
        System.out.println("Car Engine");
    }
}
