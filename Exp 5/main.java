import java.util.Scanner;

class student
{
    String name;
    int roll;
    String dob;

    public void Inputdata()
    {
	Scanner sc = new Scanner(System.in);

	System.out.print("Enter your full name: ");
	name = sc.nextLine();
	
	System.out.print("Enter your roll no.: ");
	roll = sc.nextInt();
	sc.nextLine();

	System.out.print("Enter date of birth (DD/MM/YYYY): ");
        dob = sc.nextLine();
		
    }
}

class marks extends student
{
    int marks1, marks2, marks3, marks4, marks5;
    int total;
    double percentage;
    String grade;

    public void readdata()
    {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter marks of subject 1: ");
	marks1 = sc.nextInt();

	System.out.print("Enter marks of subject 2: ");
	marks2 = sc.nextInt();

	System.out.print("Enter marks of subject 3: ");
	marks3 = sc.nextInt();
	
	System.out.print("Enter marks of subject 4: ");
	marks4 = sc.nextInt();

	System.out.print("Enter marks of subject 5: ");
	marks5 = sc.nextInt();
    }

    public void compute()
    {
	total = marks1 + marks2 + marks3 + marks4 + marks5;
	percentage = (total / 500.0) * 100;

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
	    grade = "B+";
	}
	else if(percentage >= 60)
	{
	    grade = "B";
	} 
	else if(percentage >= 50)
	{
	    grade = "C";
	}
	else 
	{
	    grade = "F";
	}
    }

    public void show()
    {
	System.out.println("Details: ");
	System.out.println("Name: " + name);
	System.out.println("Roll Number: " + roll);
        System.out.println("Date of Birth: " + dob);
        System.out.println("Marks in Subject 1: " + marks1);
        System.out.println("Marks in Subject 2: " + marks2);
        System.out.println("Marks in Subject 3: " + marks3);
        System.out.println("Marks in Subject 4: " + marks4);
        System.out.println("Marks in Subject 5: " + marks5);
        System.out.println("Total Marks: " + total);
        System.out.println("Percentage: " + percentage + "%");
        System.out.println("Grade: " + grade);
    }
}

public class main
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









































