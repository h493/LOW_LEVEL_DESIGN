package Design_Patterns.BehaviouralDesignPattern.NullObjectPattern;

public class Client {

    public static void main(String[] args) {
        Vehicle vehicle = VehicleFactory.getVehicle("BIKE");
        printVehicleDetails(vehicle);
    }

    private static void printVehicleDetails(Vehicle vehicle){
        System.out.println("Tank capacity: " + vehicle.getTankCapacity());
        System.out.println("seating capacity : " + vehicle.getSeatingCapacity());
    }
}
