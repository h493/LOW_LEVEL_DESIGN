package Design_Patterns.ObserverDesignPattern.Observable;

import Design_Patterns.ObserverDesignPattern.Observer.NotificationAlertObserver;

public interface StockObservable {

     void add(NotificationAlertObserver observer);
     void remove(NotificationAlertObserver observer);

     void notifySubscribers();

     void setStockCount(int newStockAdded);

     int getStockCount();
}
