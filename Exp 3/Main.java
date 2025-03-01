// Write a Java program to create a class called Account with instance variables accountNumber and balance. 
// Implement a parameterized constructor that initializes these variables with validation:
// •	accountNumber should be non-null and non-empty.
// •	balance should be non-negative.
// •	Print an error message if the validation fails.

import java.util.Scanner;

class Account {
    String accountNumber;
    double balance;

    public Account(String accountNumber, double balance) 
    {
        if (accountNumber == null || accountNumber.trim().isEmpty()) 
        {
            System.out.println("Error: Account number cannot be null or empty.");
            return;
        }
        if (balance < 0) {
            System.out.println("Error: Balance cannot be negative.");
            return;
        }

        this.accountNumber = accountNumber;
        this.balance = balance;
        System.out.println("Account created successfully!");
    }

    public void display() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
    }
}

// Main class to run the program
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter Account Number: ");
        String accNum = sc.nextLine();

        System.out.print("Enter Initial Balance: ");
        double bal = sc.nextDouble();

        // Creating Account object
        Account acc = new Account(accNum, bal);

        // Display account details only if created successfully
        if (acc.accountNumber != null) {
            acc.display();
        }

        sc.close(); // Close Scanner
    }
}

