// WAP to compute the area of the room by illustrating the concept of constructor overloading where the length and breadth 
// of the room passed as parameter through constructor which are same in one constructor and different in another constructor. 
// Further use a method that computes the area of the room. 
import java.util.Scanner;

class room {
    double length;
    double breadth;
    public room(double side) {
        length = breadth = side;
    }
    public room(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    public double computeArea() {
        return length * breadth;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the side length for the square room:");
        double side = sc.nextDouble();
        room squareRoom = new room(side);
        System.out.println("Area of the square room: " + squareRoom.computeArea());

        System.out.println("Enter the length of the rectangular room:");
        double length = sc.nextDouble(); 
        System.out.println("Enter the breadth of the rectangular room:");
        double breadth = sc.nextDouble(); 
        room rectangularRoom = new room(length, breadth); 
        System.out.println("Area of the rectangular room: " + rectangularRoom.computeArea());
    }
}
