/* Create a class “Person” with fields “name” and “age” and a method “display()” that prints the name and age of the person.
Create a subclass “Employee” that extends “Person” and adds a field “salary” and a method “display_Emp()” that prints the name, age, and salary of the employee.
Create a subclass “Manager” that extends “Employee” and adds a field “department” and a method “display_Manager()” that prints the name, age, salary, and department of the manager.
Create an object of the “Employee” class and call the “display () and display_Emp()” method.
Create an object of the “Manager” class and call the “display () and display_Manager ()” method. */

import java.util.Scanner;

class Person 
{
    String name;
    int age;

    public void inputPerson() 
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        name = sc.nextLine();
        System.out.print("Enter age: ");
        age = sc.nextInt();
    }

    public void display() 
    {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Employee extends Person 
{
    int salary;

    public void inputEmployee() 
    {
        inputPerson(); // Get name and age first
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter salary: ");
        salary = sc.nextInt();
    }

    public void display_Emp() {
        display(); // Print name and age
        System.out.println("Salary: " + salary);
    }
}

class Manager extends Employee {
    String department;

    public void inputManager() {
        inputEmployee(); // Get name, age, and salary first
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter department: ");
        department = sc.nextLine();
    }

    public void display_Manager() {
        display_Emp(); // Print name, age, and salary
        System.out.println("Department: " + department);
    }
}

public class main2 {
    public static void main(String[] args) {
        Employee emp = new Employee();
        System.out.println("Enter Employee Details:");
        emp.inputEmployee();
        emp.display_Emp();

        System.out.println("\nEnter Manager Details:");
        Manager mgr = new Manager();
        mgr.inputManager();
        mgr.display_Manager();
    }
}
