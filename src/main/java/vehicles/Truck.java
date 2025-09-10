package vehicles;

public class Truck extends Vehicle {
    private int capacity;

    public Truck(String licensePlate, String make, String model, double rentalPrice, int capacity) {
        super(licensePlate, make, model, rentalPrice);
        this.capacity = capacity;
    }
    public int getCapacity() { return capacity; }

    @Override
    public double calculateRentalCost(int days) {
        return days*rentalPrice+10*capacity;
    }
}
