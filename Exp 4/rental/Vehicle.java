package rental;

public class Vehicle {
    private String vehicleNumber, model;
    protected double rentalRate;

    public Vehicle(String vehicleNumber, String model, double rentalRate) {
        this.vehicleNumber = vehicleNumber;
        this.model = model;
        this.rentalRate = rentalRate;
    }

    //Protected method (Only accessible within package)
    protected double calculateRental(int days) {
        return rentalRate * days;
    }

    // Public method to access rental from outside package
    public double getRentalAmount(int days) {
        return calculateRental(days);
    }
}
