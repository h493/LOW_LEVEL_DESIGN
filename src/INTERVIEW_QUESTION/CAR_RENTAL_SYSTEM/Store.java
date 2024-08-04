package INTERVIEW_QUESTION.CAR_RENTAL_SYSTEM;

import INTERVIEW_QUESTION.CAR_RENTAL_SYSTEM.Product.Vehicle;
import INTERVIEW_QUESTION.CAR_RENTAL_SYSTEM.Product.VehicleType;

import java.util.ArrayList;
import java.util.List;

public class Store {
    int storeId;
    VehicleInventoryManagement inventoryManagement;
    Location storeLocation;
    List<Reservation> reservations = new ArrayList<>();

    public List<Vehicle> getVehicles(VehicleType vehicleType){
        return inventoryManagement.getVehicles();
    }

    //addVehicles, update vehicles, use inventory management to update those.

    public void setVehicles(List<Vehicle> vehicles) {
        inventoryManagement = new VehicleInventoryManagement(vehicles);
    }

    public Reservation createReservation(Vehicle vehicle , User user){
        Reservation reservation = new Reservation();
        reservation.createReservation(user, vehicle);
        reservations.add(reservation);
        return  reservation;
    }

    public boolean completeReservation(int reservationId){
        //take out the reservation from the list and call complete the reservation method.
        return true;
    }

    //update Reservation
}
