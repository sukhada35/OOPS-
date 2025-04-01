//2. Write a program that prompts the user to input two numbers and then divides the first number by the second number.
// Handle the case where the second number is zero by catching the arithmetic exception and displaying a message 
//such as "Cannot divide by zero." Ensure that the program handles valid input, even when a zero divisor is entered.

import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = 0, num2 = 0, result;

        try {
            System.out.print("Enter a valid integer 1: ");
            String input1 = sc.nextLine();
            System.out.print("Enter a valid integer 2: ");
            String input2 = sc.nextLine();

            num1 = Integer.parseInt(input1); // Convert to integer
            num2 = Integer.parseInt(input2);

            result = num1 / num2;
            System.out.println("Result: "+ result);
        } 
        
        catch (NumberFormatException e) // if abc
        {
            System.out.println("Error: Invalid number format! Please enter integers only.");
        }

        catch (ArithmeticException e) // if number2 is zero
        {
            System.out.println("Error: Cannot divide by zero! Please enter a valid denominator.");
        }

        finally 
        {
            System.out.println("Input process complete.");
            sc.close(); 
        }
    }
}
