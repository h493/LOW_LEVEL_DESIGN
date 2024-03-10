package Design_Patterns.BehaviouralDesignPattern.MediatorDesignPattern;

public class Client {

    public static void main(String[] args) {
        AuctionMediator auctionMediatorObj = new Auction();
        Colleague bidder1 = new Bidder("Himanshu", auctionMediatorObj);
        Colleague bidder2 = new Bidder("Tushar", auctionMediatorObj);

        bidder2.placeBid(100);
        bidder1.placeBid(1231);
        bidder1.placeBid(123144);

    }
}
