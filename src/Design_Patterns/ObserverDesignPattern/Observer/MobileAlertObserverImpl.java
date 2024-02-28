package Design_Patterns.ObserverDesignPattern.Observer;

import Design_Patterns.ObserverDesignPattern.Observable.StockObservable;

public class MobileAlertObserverImpl implements NotificationAlertObserver {
    private final String mobileNo;
    private StockObservable stockObservable;

    public MobileAlertObserverImpl(String mobileNo, StockObservable stockObservable){
        this.mobileNo = mobileNo;
        this.stockObservable = stockObservable;
    }

    @Override
    public void update() {
            sendMessage(mobileNo, "Hurry up product is in stock");
    }

    private void sendMessage(String mobileNo, String msg){
        System.out.println("Message send to" + mobileNo);
    }
}
