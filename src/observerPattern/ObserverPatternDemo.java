package observerPattern;

public class ObserverPatternDemo {
    public static void main(String[] args) {
        Subject subject = new Subject();
        new ObserverA(subject);
        new ObserverB(subject);
        System.out.println("first state change 15");
        subject.setState(15);
        System.out.println("second state change 25");
        subject.setState(25);
    }
}