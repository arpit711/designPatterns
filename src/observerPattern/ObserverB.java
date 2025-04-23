package observerPattern;

public class ObserverB extends Observer{
    public ObserverB(Subject subject){
        this.subject = subject;
        this.subject.attach(this);
    }
    @Override
    public void update() {
        System.out.println("String: " + Integer.toBinaryString(subject.getState()));
    }
}
