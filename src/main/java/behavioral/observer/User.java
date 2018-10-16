package behavioral.observer;

import java.util.ArrayList;
import java.util.List;

public class User implements Observable {
    private String email;
    Observer observer;
    List<Observer> observers = new ArrayList<Observer>();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObservers() {
        observers.forEach(ob -> ob.handle(email));
    }
    public void setEmail(String email){
        this.email=email;
        notifyObservers();
    }
}
