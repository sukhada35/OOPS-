import java.util.Scanner;

// 1️⃣ Abstract Class: Shape3D
abstract class Shape3D {
    // Abstract methods to be implemented by subclasses
    abstract double calculateVolume();
    abstract double calculateSurfaceArea();
}

// 2️⃣ Subclass: Sphere
class Sphere extends Shape3D {
    double radius;

    // Constructor
    public Sphere(double radius) {
        this.radius = radius;
    }

    // Implementing volume calculation
    @Override
    double calculateVolume() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

    // Implementing surface area calculation
    @Override
    double calculateSurfaceArea() {
        return 4 * Math.PI * Math.pow(radius, 2);
    }
}

// 3️⃣ Subclass: Cube
class Cube extends Shape3D {
    double side;

    // Constructor
    public Cube(double side) {
        this.side = side;
    }

    // Implementing volume calculation
    @Override
    double calculateVolume() {
        return Math.pow(side, 3);
    }

    // Implementing surface area calculation
    @Override
    double calculateSurfaceArea() {
        return 6 * Math.pow(side, 2);
    }
}

// 4️⃣ Main Class
public class ma {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Sphere input and calculations
        System.out.print("Enter radius of Sphere: ");
        double sphereRadius = sc.nextDouble();
        Sphere sphere = new Sphere(sphereRadius);
        System.out.println("Sphere Volume: " + String.format("%.2f", sphere.calculateVolume()));
        System.out.println("Sphere Surface Area: " + String.format("%.2f", sphere.calculateSurfaceArea()));

        // Cube input and calculations
        System.out.print("\nEnter side length of Cube: ");
        double cubeSide = sc.nextDouble();
        Cube cube = new Cube(cubeSide);
        System.out.println("Cube Volume: " + String.format("%.2f", cube.calculateVolume()));
        System.out.println("Cube Surface Area: " + String.format("%.2f", cube.calculateSurfaceArea()));

        sc.close();
    }
}
