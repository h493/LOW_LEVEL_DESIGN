package INTERVIEW_QUESTION.CAR_RENTAL_SYSTEM;

public class Bill {
    Reservation reservation;
    double totalBillAmount;
    boolean isBillPaid;

    Bill(Reservation reservation) {
        this.reservation = reservation;
        this.totalBillAmount = computeBillAmount();
        isBillPaid = false;
    }

    private double computeBillAmount(){

        return 100.0;
    }

}
