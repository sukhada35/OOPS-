 //3. Create a class “Vehicle” with a method “drive ()” that displays a message “Driving a vehicle”. 
 //Create two subclasses “Car” and “Bike” that extend “Vehicle” and implement the
//“drive_car ()” and “drive_bike ()” method to display “Driving a car” and “Driving a bike” respectively.
import java.util.Scanner;

class Vehicle
{
    public void drive()
    {
        System.out.print("Driving a vehicle.");
    }
}
class Car extends Vehicle
{
    public void drive_car()
    {
        System.out.print("Driving a car.");
    }
}
class Bike extends Vehicle
{
    public void drive_bike()
    {
        System.out.print("Driving a bike.");
    }
}

class pracforexp5
{
    public static void main(String[] args)
    {
        Vehicle vc = new Vehicle(); 
        vc.drive();

        Car cr = new Car(); 
        cr.drive_car();

        Bike bk = new Bike(); 
        bk.drive_bike(); 
    }
}