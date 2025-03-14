// Create a class “Person” with fields “name” and “age” and a method “display()” that prints the name and age of the person.
// Create a subclass “Employee” that extends “Person” and adds a field “salary” and a method “display_Emp()” that prints the name, age, and salary of the employee.
// Create a subclass “Manager” that extends “Employee” and adds a field “department” and a method “display_Manager()” that prints the name, age, salary, and department of the manager.
// Create an object of the “Employee” class and call the “display () and display_Emp()” method.
// Create an object of the “Manager” class and call the “display () and display_Manager ()” method.

import java.util.Scanner;
class person
{
    String name;
    int age;

    public void display()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        name = sc.nextLine();

        System.out.print("Enter your age: ");
        age = sc.nextInt();
    }
}
class Employee extends person
{
    int salary;
    
    public void display_Emp()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter yor salary: ");
        salary = sc.nextInt();
        System.out.print("Name: " + name);
        System.out.print("Age: " + age);
        System.out.print("Salary: " + salary);
    }
}

class Manager extends Employee
{
    String department;
    public void display_Manager()
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your department: ");
        department = sc.nextLine(); 
        System.out.print("Name: " + name);
        System.out.print("Age: " + age);
        System.out.print("Salary: " + salary);
        System.out.print("Department: " + department);
    }
}
class pracforexp5
{
    public static void main(String[] args)
    {

        Employee em = new Employee();
        em.display();
        em.display_Emp();
        Manager mg = new Manager();
        mg.display();
        mg.display_Manager();
    }
}