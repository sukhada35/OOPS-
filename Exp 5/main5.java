//The program now uses a "Flight" base class and its subclasses "PassengerFlight" and "CargoFlight." 
//Each subclass overrides the “fly()” method to provide specific behavior.

import java.util.Scanner;

class Flight
{
    public void fly()
    {
        System.out.println("Flyy");
    }
}
class PassengerFlight extends Flight
{
    @Override
    public void fly()
    {
        System.out.println("P Flyy");
    }
}
class CargoFlight extends Flight
{
    @Override
    public void fly()
    {
        System.out.println("C Flyy");
    }
}
public class main5 
{
    public static void main(String[] args)
    {
        Flight f = new Flight();
        f.fly();
        
        PassengerFlight pf = new PassengerFlight();
        pf.fly();

        CargoFlight cf = new CargoFlight();
        cf.fly();
    }
}
