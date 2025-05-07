//4. Write a program that takes two inputs from the user: a number and an index. The program should perform the following checks:
//1.	If the input number is not an integer, throw a number format exception.
//2.	If the index is out of bounds for an array of size 5, throw an array index out of bounds exception.
//3.	If there is an attempt to divide by zero when performing an operation, throw an arithmetic exception.

import java.util.Scanner;

public class task4ka3 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int number = 0, index = 0;
        int[] arr = {10, 20, 30, 40, 50};

        try {
            // Taking number input
            System.out.print("Enter a valid integer: ");
            String numInput = sc.nextLine();
            number = Integer.parseInt(numInput);

            // Taking index input
            System.out.print("Enter an index (0-4): ");
            String indexInput = sc.nextLine();
            index = Integer.parseInt(indexInput);

            System.out.println("Value at index " + index + ": " + arr[index]);

  
            System.out.print("Enter a divisor: ");
            int divisor = sc.nextInt();
            int result = number / divisor; // Might throw ArithmeticException
            System.out.println("Result of division: " + result);
        } 
        catch (NumberFormatException e) //4.1
        {
            System.out.println("Error: Invalid input! Please enter a valid integer.");
        } 
        catch (ArrayIndexOutOfBoundsException e) // 4.2 
        {
            System.out.println("Error: Index out of bounds! Enter an index between 0 and 4.");
        } 
        catch (ArithmeticException e) 
        {
            System.out.println("Error: Cannot divide by zero!");
        } 
        finally 
        {
            System.out.println("Input process complete.");
            sc.close(); // Closing scanner
        }
    }
}

