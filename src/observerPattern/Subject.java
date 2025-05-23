package observerPattern;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private List <Observer> observers = new ArrayList<Observer>();
    private int state;

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }
    public int getState() {
        return this.state;
    }

    public void attach(Observer observer) {
        observers.add(observer);
    }

    void notifyAllObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
