package patterns.order;

import patterns.notification.Observer;

public interface Observable {

    void registerObserver(Observer observer);
    void unregisterObserver(Observer observer);
    void norifyObservers();

}
