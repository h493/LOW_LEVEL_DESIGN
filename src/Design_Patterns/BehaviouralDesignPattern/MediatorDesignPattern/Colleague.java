package Design_Patterns.BehaviouralDesignPattern.MediatorDesignPattern;

public interface Colleague {

    void placeBid(int bidAmount);
    void receivedBidNotification(int bidAmount);
    String getName();
}
