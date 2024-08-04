package INTERVIEW_QUESTION.CAR_RENTAL_SYSTEM;

import INTERVIEW_QUESTION.CAR_RENTAL_SYSTEM.Product.Car;
import INTERVIEW_QUESTION.CAR_RENTAL_SYSTEM.Product.Vehicle;
import INTERVIEW_QUESTION.CAR_RENTAL_SYSTEM.Product.VehicleType;

import java.util.ArrayList;
import java.util.List;

public class Client {

    public static void main(String[] args) {

        List<User> users = addUsers();
        List<Vehicle> vehicles = addVehicles();
        List<Store> stores = addStores(vehicles);

        VehicleRentalSystem rentalSystem = new VehicleRentalSystem(stores, users);

        //0. User comes
        User user = users.get(0);

        //1. user search store based on location
        Location location = new Location("gj", 403012, "Karnataka", "delhi","India");
        Store store = rentalSystem.getStore(location);

        //2. get All vehicles you are interested in (based upon different filters)
        List<Vehicle> storeVehicles = store.getVehicles(VehicleType.CAR);


        //3.reserving the particular vehicle
        Reservation reservation = store.createReservation(storeVehicles.get(0), users.get(0));

        //4. generate the bill
        Bill bill = new Bill(reservation);

        //5. make payment
        Payment payment = new Payment();
        payment.payBill(bill);

        //6. trip completed, submit the vehicle and close the reservation
        store.completeReservation(reservation.reservationId);


    }

    public static List<Vehicle> addVehicles(){

        List<Vehicle> vehicles = new ArrayList<>();

        Vehicle vehicle1 = new Car();
        vehicle1.setVehicleNumber(1);
        vehicle1.setVehicleType(VehicleType.CAR);

        Vehicle vehicle2 = new Car();
        vehicle1.setVehicleNumber(2);
        vehicle1.setVehicleType(VehicleType.CAR);

        vehicles.add(vehicle1);
        vehicles.add(vehicle2);

        return vehicles;
    }


    public static List<User> addUsers(){
        List<User> userList = new ArrayList<>();
        User user1 = new User();
        user1.setUserId(1);

        userList.add(user1);
        return  userList;
    }

    public static List<Store> addStores(List<Vehicle> vehicles){

        List<Store> stores = new ArrayList<>();
        Store store1 = new Store();
        store1.storeId=1;
        store1.setVehicles(vehicles);

        stores.add(store1);
        return stores;
    }

}
