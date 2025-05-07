// Create a class named Eligible that has data members as number of classes held and attended, as well as methods: input() and compute(). 
// The input() accepts the data from user and compute() calculates the percentage and verifies that a student having 80% or more than displays 
// a message as “ student permitted to appear in the exam” otherwise “student not permitted to appear in the exam”. 
// Create an instance of a class that invokes the both the methods.

import java.util.Scanner;

public class Eligible
{
    int classHeld;
    int classAttended;

    public void input() {
        Scanner sc = new Scanner(System.in); // Scanner object
        System.out.print("Enter the number of classes held: ");
        classHeld = sc.nextInt();

        System.out.print("Enter the number of classes attended: ");
        classAttended = sc.nextInt();
    }

    public void compute() 
    {
        if (classHeld == 0) 
        { 
            System.out.println("No classes were held. Attendance cannot be calculated.");
            return;
        }
        
        double attendancePercentage = ((double) classAttended / classHeld) * 100;

        System.out.println("Attendance Percentage: " + attendancePercentage + "%");

        if (attendancePercentage >= 80) {
            System.out.println("Student permitted to appear in the exam.");
        } else {
            System.out.println("Student not permitted to appear in the exam.");
        }
    }

    public static void main(String[] args) 
    {
        Eligible student = new Eligible(); 

        student.input(); 
        student.compute(); 
    }
}

