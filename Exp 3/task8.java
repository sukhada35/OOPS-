import java.util.Scanner;

// Write a Java program to create a class called Dog with instance variables name and color. 
// Implement a parameterized constructor that takes name and color as parameters and initializes the instance variables. 
// Print the values of the variables.
public class task8 
{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) 
    {
        String name, colour;
        System.out.print("Enter dog name: ");
        name = sc.nextLine();
        System.out.print("Enter dog colour: ");
        colour = sc.nextLine();
        Dog obj = new Dog(name,colour);
        obj.display();
    }    
}
class Dog
{
    String name,color;
    Dog(String n,String c)
    {
        name = n;
        color = c;
    }
    void display()
    {
        System.out.println("Dog Name: " + name);
        System.out.println("Dog Colour: " + color);
    }
}

