package Design_Patterns.ObserverDesignPattern;

import Design_Patterns.ObserverDesignPattern.Observable.IphoneObservable;
import Design_Patterns.ObserverDesignPattern.Observable.StockObservable;
import Design_Patterns.ObserverDesignPattern.Observer.EmailAlertObserverImpl;
import Design_Patterns.ObserverDesignPattern.Observer.MobileAlertObserverImpl;
import Design_Patterns.ObserverDesignPattern.Observer.NotificationAlertObserver;

public class Store {

    public static void main(String[] args) {
        StockObservable iphoneStockObservable = new IphoneObservable();

        NotificationAlertObserver observer1 = new EmailAlertObserverImpl("xyz1@gmail.com", iphoneStockObservable);
        NotificationAlertObserver observer2 = new EmailAlertObserverImpl("xyz2@gmail.com", iphoneStockObservable);
        NotificationAlertObserver observer3 = new MobileAlertObserverImpl("7206690063", iphoneStockObservable);

        iphoneStockObservable.add(observer1);
        iphoneStockObservable.add(observer2);
        iphoneStockObservable.add(observer3);

        iphoneStockObservable.setStockCount(10);

    }
}
