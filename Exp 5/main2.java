Create a class “Person” with fields “name” and “age” and a method “display()” that prints the name and age of the person.
Create a subclass “Employee” that extends “Person” and adds a field “salary” and a method “display_Emp()” that prints the name, age, and salary of the employee.
Create a subclass “Manager” that extends “Employee” and adds a field “department” and a method “display_Manager()” that prints the name, age, salary, and department of the manager.
Create an object of the “Employee” class and call the “display () and display_Emp()” method.
Create an object of the “Manager” class and call the “display () and display_Manager ()” method.

import java.util.Scanner;

class Person
{
    String name;
    int age;

    class void display()
    {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter your name: ");
	name = sc.nextLine();

	System.out.println("Enter your age: ");
	age = sc.nextInt();
    }
}

class Employee extends Person
{
    int salary;
    System.out.println("Enter your salary: ");
    salary = sc.nextInt();
    class void display_Emp()
    {
	System.out.println("Name:" + name);
	System.out.println("Age:" + age);
	System.out.println("Salary:" + salary);
    }
}

class 