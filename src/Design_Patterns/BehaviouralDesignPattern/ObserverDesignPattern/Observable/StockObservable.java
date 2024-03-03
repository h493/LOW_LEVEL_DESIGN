package Design_Patterns.BehaviouralDesignPattern.ObserverDesignPattern.Observable;

import Design_Patterns.BehaviouralDesignPattern.ObserverDesignPattern.Observer.NotificationAlertObserver;

public interface StockObservable {

     void add(NotificationAlertObserver observer);
     void remove(NotificationAlertObserver observer);

     void notifySubscribers();

     void setStockCount(int newStockAdded);

     int getStockCount();
}
