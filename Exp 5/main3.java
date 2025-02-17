import java.util.Scanner;

class vehicle
{
    public void drive()
    {
	System.out.print("Driving a vehicle.");
    }
}

class Car extends vehicle
{
    public void drive_car()
    {
	System.out.print("Driving a car.");
    }
}

class Bike extends vehicle
{
    public void drive_bike()
    {
	System.out.print("Driving a bike.");
    }
}

public class main3
{
    public static void main(String[] args)
    {
	vehicle car = new Car();
        vehicle bike = new Bike();
	
	car.drive();
	bike.drive();

	((Car) car).drive_car();
        ((Bike) bike).drive_bike();
    }
}

