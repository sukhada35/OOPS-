// Create a class “Person” with fields “name” and “age” and a method “display()” that prints the name and age of the person.
// Create a subclass “Employee” that extends “Person” and adds a field “salary” and a method “display_Emp()” that prints the name, age, and salary of the employee.
// Create a subclass “Manager” that extends “Employee” and adds a field “department” and a method “display_Manager()” that prints the name, age, salary, and department of the manager.
// Create an object of the “Employee” class and call the “display () and display_Emp()” method.
// Create an object of the “Manager” class and call the “display () and display_Manager ()” method.

import java.util.Scanner;

class Person {
    String name;
    int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Display method
    public void display() {
        System.out.println("\n🔹 Person Details 🔹");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Employee extends Person {
    int salary;

    // Constructor using super
    public Employee(String name, int age, int salary) {
        super(name, age); // Calls the constructor of Person
        this.salary = salary;
    }

    // Display Employee details
    public void display_Emp() {
        super.display(); // Call Person's display method
        System.out.println("Salary: ₹" + salary);
    }
}
class Manager extends Employee {
    String department;

    // Constructor using super
    public Manager(String name, int age, int salary, String department) {
        super(name, age, salary); // Calls the constructor of Employee
        this.department = department;
    }

    // Display Manager details
    public void display_Manager() {
        super.display_Emp(); // Call Employee's display method
        System.out.println("Department: " + department);
    }
}

public class pracforexp5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input for Employee
        System.out.print("Enter Employee Name: ");
        String empName = sc.nextLine();
        System.out.print("Enter Employee Age: ");
        int empAge = sc.nextInt();
        System.out.print("Enter Employee Salary: ₹");
        int empSalary = sc.nextInt();
        sc.nextLine(); // Consume newline

        // Creating Employee Object
        Employee emp = new Employee(empName, empAge, empSalary);
        emp.display();
        emp.display_Emp();

        // Taking input for Manager
        System.out.print("\nEnter Manager Name: ");
        String mgrName = sc.nextLine();
        System.out.print("Enter Manager Age: ");
        int mgrAge = sc.nextInt();
        System.out.print("Enter Manager Salary: ₹");
        int mgrSalary = sc.nextInt();
        sc.nextLine(); // Consume newline
        System.out.print("Enter Manager Department: ");
        String mgrDept = sc.nextLine();

        // Creating Manager Object
        Manager mgr = new Manager(mgrName, mgrAge, mgrSalary, mgrDept);
        mgr.display();
        mgr.display_Manager();

        sc.close(); // Close Scanner
    }
}
