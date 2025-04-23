package observerPattern;

import observerPattern.Subject;

public class ObserverA extends Observer{

    private final Subject subject;

    public ObserverA(Subject subject) {
        this.subject = subject;
        this.subject.attach((Observer) this);

    }

    @Override
    public void update() {
        System.out.println("String: " + Integer.toBinaryString(subject.getState()));
    }
}
