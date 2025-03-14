//Create a class “Person” with a method “speak ()” that displays a message “The person is speaking”. 
//Create two subclasses “Student” and “Teacher” that extend “Person” and perform the “speak ()” method 
//to display “The student is asking a question” and “The teacher is giving a lecture” respectively.

import java.util.Scanner;

class Person
{
    public void speak()
    {
	System.out.println("The person is speaking.");
    }
}

class Student extends Person
{
    @Override
    public void speak()
    {
	System.out.println("The student is asking a question.");
    }
}

class Teacher extends Person
{
    @Override
    public void speak()
    {
	System.out.println("The teacher is giving a lecture.");
    }
}

public class main4
{
    public static void main(String[] args)
    {
        Person pr = new Person();
        pr.speak();

        Student sd = new Student();
        sd.speak();

        Teacher tr = new Teacher();
        tr.speak();
    }
}


