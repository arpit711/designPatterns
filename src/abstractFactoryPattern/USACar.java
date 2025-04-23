package abstractFactoryPattern;

public class USACar implements Car {
    @Override
    public void run() {
        System.out.println("USA Car");
    }
}
