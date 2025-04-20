public class ObserverA extends Observer{

    public ObserverA(Subject subject) {
        this.subject = subject;
        this.subject.attach(this);

    }

    @Override
    public void update() {
        System.out.println("String: " + Integer.toBinaryString(subject.getState()));
    }
}
