// Define an interface for shapes and implement it in classes like Circle and Rectangle.
// [Hint: use the abstract class, interface, constructor]

import java.util.Scanner;

interface Shape 
{
  double calculateArea(); 
}

abstract class AbstractShape implements Shape 
{
    String name; // Common property

    // Constructor for setting shape name
    public AbstractShape(String name) 
  {
        this.name = name;
    }

    // Common method for displaying shape details
    public void display() 
  {
        System.out.println("Shape: " + name);
        System.out.println("Area: " + calculateArea());
    }
}

class Circle extends AbstractShape 
{
    double radius;
    
    // Constructor
    public Circle(double radius) 
    {
        super("Circle"); // Call AbstractShape constructor
        this.radius = radius;
    }

    // Implement calculateArea() from Shape interface
    public double calculateArea() 
    {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends AbstractShape 
{
    double length, width;

    // Constructor
    public Rectangle(double length, double width) 
    {
        super("Rectangle"); // Call AbstractShape constructor
        this.length = length;
        this.width = width;
    }

    // Implement calculateArea() from Shape interface
    public double calculateArea() 
    {
        return length * width;
    }
}

public class Main1 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        // Input for Circle
        System.out.print("Enter radius of Circle: ");
        double radius = sc.nextDouble();
        Circle circle = new Circle(radius);
        circle.display(); // Call display method

        // Input for Rectangle
        System.out.print("\nEnter length of Rectangle: ");
        double length = sc.nextDouble();
        System.out.print("Enter width of Rectangle: ");
        double width = sc.nextDouble();
        Rectangle rectangle = new Rectangle(length, width);
        rectangle.display(); // Call display method

        sc.close();
    }
}



