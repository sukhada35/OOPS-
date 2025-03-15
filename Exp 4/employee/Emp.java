//1. WAP to perform employee payroll processing using packages. In the java file, Emp.java creates a package employee
// and creates a class Emp. Declare the variables name, emp_id, category, basic_pay, hra, da, net_pay, PF, gross_pay, 
//income_tax, and allowance. Calculate the values in methods. Create another java file Emppay.java. Create an object e 
//to call the methods to perform and print values.

package employee;

import java.util.Scanner;

public class Emp 
{
    private String name, category;
    private int emp_id;
    private double basic_pay, hra, da, pf, income_tax, allowance, gross_pay, net_pay;

    public void getDetails() 
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Employee Name: ");
        name = sc.nextLine();
        
        System.out.print("Enter Employee ID: ");
        emp_id = sc.nextInt();
        
        sc.nextLine();
        
        System.out.print("Enter Employee Category: ");
        category = sc.nextLine();
        
        System.out.print("Enter Basic Pay: ");
        basic_pay = sc.nextDouble();

        sc.close();
    }

    public void calculateSalary() 
    {
        hra = 0.20 * basic_pay;
        da = 0.50 * basic_pay; 
        pf = 0.12 * basic_pay; 
        allowance = 0.10 * basic_pay; 
        gross_pay = basic_pay + hra + da + allowance;
        income_tax = 0.10 * gross_pay;
        net_pay = gross_pay - (pf + income_tax);
    }

    public void displaySalary() 
    {
        System.out.println("\n Employee Payroll Details ");
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + emp_id);
        System.out.println("Category: " + category);
        System.out.println("Basic Pay: " + basic_pay);
        System.out.println("HRA: " + hra);
        System.out.println("DA: " + da);
        System.out.println("Allowance: " + allowance);
        System.out.println("Gross Pay: " + gross_pay);
        System.out.println("PF Deduction: " + pf);
        System.out.println("Income Tax: " + income_tax);
        System.out.println("Net Pay: " + net_pay);
    }
}



