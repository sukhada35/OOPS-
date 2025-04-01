// Write a program that takes user input for a number. Ensure that the input is a valid integer.
// If the input is not a valid integer (e.g., letters or special characters), catch the number 
//format exception and display an appropriate error message. 
//Use the finally block to print a message indicating that the input process is complete.

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int number = 0;

        try 
        {
            System.out.print("Enter a valid integer: ");
            String input = sc.nextLine(); 
            number = Integer.parseInt(input);  
            System.out.println("You entered a valid integer: " + number);
        } 
        catch (NumberFormatException e) 
        {
            System.out.println("Error: Invalid input! Please enter a valid integer.");
        } 
        finally 
        {
            System.out.println("Input process complete.");
            sc.close();  
        }
    }
}
