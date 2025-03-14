//Write a Java program to create an abstract class Instrument with abstract methods play() and tune(). 
//Create subclasses for Glockenspiel and Violin that extend the Instrument class and implement the respective methods 
//to play and tune each instrument.

import java.util.Scanner;

abstract class Instrument 
{
    abstract String play();
    abstract String tune();
}

class Glockenspiel extends Instrument
{
    @Override
    String play() {
        return "Playing a bright, metallic melody on the Glockenspiel.";
    }

    @Override
    String tune() {
        return "Tuning the Glockenspiel by adjusting the metal bars.";
    }
}

class Violin extends Instrument
{
    @Override
    String play() 
    {
        return " Playing a soothing violin tune with a bow.";
    }

    @Override
    String tune() 
    {
        return "Tuning the violin by adjusting the strings.";
    }    
}
public class main7 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        // Creating Glockenspiel object
        Glockenspiel glock = new Glockenspiel();
        // glock.play();
        // glock.tune();
        System.out.println(glock.tune());
        System.out.println(glock.play());

        // Creating Violin object
        Violin violin = new Violin();
        // violin.play();
        // violin.tune();
        System.out.println(violin.tune());
        System.out.println(violin.play());

        sc.close();
    }
}