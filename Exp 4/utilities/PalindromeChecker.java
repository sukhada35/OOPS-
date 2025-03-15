package utilities;

import java.util.Scanner;

public class PalindromeChecker {
    public void checkPalindrome() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        // Convert to lowercase & remove spaces
        String formattedString = input.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");

        // Reverse the string using StringBuffer
        StringBuffer reversed = new StringBuffer(formattedString).reverse();

        // Check if it's a palindrome
        if (formattedString.equals(reversed.toString())) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is NOT a palindrome.");
        }

        sc.close();
    }
}
