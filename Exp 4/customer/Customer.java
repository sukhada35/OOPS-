package customer;

import rental.Car;  // Import Car class from rental package

public class Customer {
    public static void main(String[] args) {
        Car myCar = new Car("MH12AB1234", "Sedan");
        
        //  Use public method instead of calling protected method directly
        System.out.println("Rental Amount for 5 days: " + myCar.getRentalAmount(5));
    }
}
