package INTERVIEW_QUESTION.CAR_RENTAL_SYSTEM;

import INTERVIEW_QUESTION.CAR_RENTAL_SYSTEM.Product.Vehicle;

import java.util.Date;

public class Reservation {
    int reservationId;
    User user;
    Vehicle vehicle;
    Date bookingDate;
    Date dateBookedFrom;
    Date dateBookedTo;
    Long fromtimeStamp;
    Long toTimeStamp;
    Location pickupLocation;
    Location dropLocation;
    ReservationType reservationType;
    ReservationStatus reservationStatus;
    Location location;

    public int createReservation(User user, Vehicle vehicle){
        // generating new id;
        this.reservationId  = 123;
        this.user = user;
        this.vehicle = vehicle;
        this.reservationStatus = ReservationStatus.SCHEDULED;
        this.reservationType = ReservationType.DAILY;

        return reservationId;
    }
    //CRUD
}
