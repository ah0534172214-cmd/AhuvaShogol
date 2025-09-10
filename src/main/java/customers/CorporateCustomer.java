package customers;

import vehicles.Vehicle;

import java.util.ArrayList;
import java.util.List;

public class CorporateCustomer implements Customer{
    private String companyName;
    private List<Vehicle> rentedVehicles;
    public CorporateCustomer(String companyName){
        this.companyName=companyName;
        this.rentedVehicles=new ArrayList<>();
    }
    @Override
    public String getName(){
        return companyName;
    }
    @Override
    public List<Vehicle> getRentedVehicles() { return rentedVehicles; }

    @Override
    public void rentVehicle(Vehicle vehicle, int days) {
        rentedVehicles.add(vehicle);
        double cost = vehicle.calculateRentalCost(days)*0.8;
        System.out.println(companyName + " rented " + vehicle.getMake() + " " + vehicle.getModel() +
                " for " + days + " days. Cost: " + cost);
    }
}
