//Create a class “Person” with a method “speak ()” that displays a message “The person is speaking”. Create two subclasses “Student” and “Teacher” that extend “Person” and perform the “speak ()” method to display “The student is asking a //question” and “The teacher is giving a lecture” respectively.

import java.util.Scanner;

class Person
{
    public void speak()
    {
	System.out.print("The person is speaking.");
    }
}

class Student extends Person
{
    public void speak()
    {
	System.out.print("The student is asking a question.");
    }
}

class Teacher extends Person
{
    public void speak()
    {
	System.out.print("The teacher is giving a lecture.");
    }
}

class 


