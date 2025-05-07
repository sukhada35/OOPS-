// Develop a Java program to define a class Student with attributes including name, rollNumber, and marks for three subjects. 
// Take user input for these attributes, and implement two methods: average() to calculate the average of the marks, 
// and printInfo() to display the student's details in a formatted manner.

import java.util.Scanner;
public class task7 
{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) 
    {
        System.out.print("Enter student name: ");
        String name = sc.nextLine();
        System.out.print("Enter student roll number: ");
        int roll = sc.nextInt();
        System.out.print("Enter marks in subject 1: ");
        float m1 = sc.nextFloat();
        System.out.print("Enter marks in subject 2: ");
        float m2 = sc.nextFloat();
        System.out.print("Enter marks in subject 3: ");
        float m3 = sc.nextFloat();
        Student obj = new Student(m1, m2, m3, name, roll);
        obj.printInfo();
    }    
}
class Student
{
    String name;
    int rollNumber;
    float m1,m2,m3;
    Student(float a,float b, float c,String n, int roll)
    {
        m1 = a;
        m2 = b;
        m3 = c;
        rollNumber = roll;
        name = n;
    }
    float average()
    {
        return (m1+m2+m3)/3;
    }
    void printInfo()
    {
        System.out.println("Student name: " + name);
        System.out.println("Student roll number: " + rollNumber);
        System.out.println("Marks in subject 1: " + m1);
        System.out.println("Marks in subject 2: " + m2);
        System.out.println("Marks in subject 3: " + m3);
        System.out.println("Average marks: " + average());
    }
}

