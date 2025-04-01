//3. Write a program that asks the user to input an index to access an array of size 5. 
//If the user enters an invalid index (i.e., an index less than 0 or greater than the array size),
// catch the array index out of bounds exception and print an error message. Allow the user to retry entering a valid index.

import java.util.Scanner;

public class task3 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        int[] arr = {10, 20, 30, 40, 50};
        int index;

        while (true) // Keep retrying until the user enters a valid index
        { 
            try 
            {
                System.out.print("Enter an index (0-4) to access the array: ");
                index = sc.nextInt();
                System.out.println("Value at index " + index + ": " + arr[index]);
                break; 
            } 
            catch (ArrayIndexOutOfBoundsException e) 
            {
                System.out.println("Error: Index out of bounds! Please enter a valid index (0-4).");
                sc.nextLine(); // Clear invalid input
            } 
            catch (Exception e) // if abc
            {
                System.out.println("Error: Invalid input! Please enter an integer.");
                sc.nextLine(); 
            }
        }

        System.out.println("Input process complete.");
        sc.close();
    }
}
