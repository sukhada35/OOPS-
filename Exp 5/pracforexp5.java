// A class “student” defines student with data members name, roll number and date of birth and methods as Inputdata().
//  Inputdata() accepts the input for instance variable. Derived the class “marks” from class “student” defines marks of various subjects, 
//  total percentage and grade of the student and methods as readdata() reads the marks out of 100, compute() calculates the percentage and 
//  assigns the grades accordingly, show() displays the name, roll number and date of birth, marks in various subjects, total, percentage and grade.

import java.util.Scanner;

class student
{
    String name;
    int roll;
    int dob;

    public void Inputdata()
    {
        Scanner sc= new Scanner(System.in);

        System.out.print("Enter your full name: ");
        name = sc.nextLine();

        System.out.print("Enter your roll no.:");
        roll = sc.nextInt();

        System.out.print("Enter your dob: ");
        dob = sc.nextInt();
        sc.nextLine();
    }
}

class marks extends student
{
    int mark1, mark2, mark3;
    int total;
    double percentage;
    String grade;

    public void readdata()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks 1: ");
        mark1 = sc.nextInt();

        System.out.println("Enter your marks 2: ");
        mark2 = sc.nextInt();

        System.out.println("Enter your marks 3: ");
        mark3 = sc.nextInt();
    }

    public void compute()
    {
        total = mark1 + mark2 + mark3;

        percentage = (total / 300.0) * 100;

        if(percentage >= 90)
        {
            grade = "A+";
        }
        else if(percentage >= 80)
        {
            grade = "A";
        }
        else if(percentage >= 70)
        {
            grade = "B";
        }
        else if(percentage >= 60)
        {
            grade = "B-";
        }
        else if(percentage >= 50)
        {
            grade = "C";
        }
        else
        {
            grade = "Fail";
        }
    }

    public void show()
    {
        System.out.println("Details: ");
	    System.out.println("Name: " + name);
	    System.out.println("Roll Number: " + roll);
        System.out.println("Date of Birth: " + dob);
        System.out.println("Marks in Subject 1: " + mark1);
        System.out.println("Marks in Subject 2: " + mark2);
        System.out.println("Marks in Subject 3: " + mark3);
        System.out.println("Total Marks: " + total);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);
    }
}

public class pracforexp5
{
    public static void main(String[] args)
    {
        marks student = new marks();
        student.Inputdata();
        student.readdata();
        student.compute();
        student.show();
    }
}