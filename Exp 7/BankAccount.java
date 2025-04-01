import java.util.Scanner;

// Custom exception for insufficient balance
class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

public class BankAccount {
    private double balance;

    // Deposit method
    public void deposit(double amount) throws IllegalArgumentException {
        if (amount < 0) {
            throw new IllegalArgumentException("Error: Deposit amount cannot be negative.");
        }
        balance += amount;
        System.out.println("Deposited: $" + amount + " | Current Balance: $" + balance);
    }

    // Withdraw method
    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException("Error: Insufficient funds! Available balance: $" + balance);
        }
        balance -= amount;
        System.out.println("Withdrawn: $" + amount + " | Remaining Balance: $" + balance);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount account = new BankAccount();

        try {
            System.out.print("Enter deposit amount: ");
            double depositAmount = sc.nextDouble();
            account.deposit(depositAmount);

            System.out.print("Enter withdrawal amount: ");
            double withdrawAmount = sc.nextDouble();
            account.withdraw(withdrawAmount);
        } 
        catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } 
        catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        } 
        finally {
            System.out.println("Transaction process complete.");
            sc.close();
        }
    }
}