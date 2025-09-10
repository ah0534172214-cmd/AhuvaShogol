import customers.CorporateCustomer;
import customers.RegularCustomer;
import vehicles.Car;
import vehicles.Truck;
import vehicles.Vehicle;

public class VehicleRental {

    public static void main(String[] args) {

        Car car1 = new Car("123-ABC", "Toyota", "Corolla", 50, "Sedan");
        Truck truck1 = new Truck("456-DEF", "Volvo", "FH16", 100, 5);


        RegularCustomer customer1 = new RegularCustomer("Avi");
        CorporateCustomer customer2 = new CorporateCustomer("TechCorp");


        customer1.rentVehicle(car1, 3);
        customer2.rentVehicle(truck1, 2);


        System.out.println("Rented vehicles by Avi:");
        for (Vehicle v : customer1.getRentedVehicles()) {
            System.out.println(v.getMake() + " " + v.getModel());
        }

        System.out.println("Rented vehicles by TechCrop:");
        for (Vehicle v : customer2.getRentedVehicles()) {
            System.out.println(v.getMake() + " " + v.getModel());
        }

    }
}
