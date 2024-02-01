package org.example;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    public List<Observer> observers = new ArrayList<Observer>();
    private int state;

    public int getState(){
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    private void notifyAllObservers() {
        for (Observer observer:observers) {
            observer.update();
        }
    }

    public void attach(Observer observer){
        observers.add(observer);
    }

    public void remove(Observer observer){
        observers.remove(observer);
    }
}
