package security;

import java.util.Scanner;

public class PasswordMasking {
    public void maskPassword() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your password: ");
        String password = sc.nextLine();

        //  Replace all characters with '*'
        StringBuffer maskedPassword = new StringBuffer(password);
        for (int i = 0; i < maskedPassword.length(); i++) {
            maskedPassword.setCharAt(i, '*');
        }

        System.out.println("Masked Password: " + maskedPassword);
        sc.close();
    }
}
