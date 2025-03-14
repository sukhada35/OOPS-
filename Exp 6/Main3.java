//WAP to create an abstract class called Payment with attributes as cardnumber,cardholder,amount and abstract methods as processPayment() 
//and displayPaymentDetails(). Create concrete classes as creditCardPayment and DebitCardPayment acquiring the properties of the Payment class.
// The creditCardPayment class consist the attribute as expiryDate and implement processPayment() that displays the 
// “credit Card Payment Processed” and displayPaymentDetails() prints details includes the cardNumber,cardholder,expiryDate and Amount. 
// The DebitCardPayment class consist the attribute as pin and implement processPayment() that displays the “Debit Card Payment Processed” 
// and displayPaymentDetails() prints details includes the cardNumber,cardholder,pin and Amount. Further create the objects for the both the 
// concrete classes and invoke the processPayment() and displayPaymentDetails. 
// [Hint: use the abstract class, constructor and super and this keyword]

import java.util.Scanner;

abstract class Payment 
{
    String cardNumber;
    String cardHolder;
    double amount;

    public Payment(String cardNumber, String cardHolder, double amount) 
    {
        this.cardNumber = cardNumber;
        this.cardHolder = cardHolder;
        this.amount = amount;
    }

    abstract void processPayment();
    abstract void displayPaymentDetails();
}

class CreditCardPayment extends Payment
{
    String expiryDate;

    public CreditCardPayment(String cardNumber, String cardHolder, double amount, String expiryDate) 
    {
        super(cardNumber, cardHolder, amount);
        this.expiryDate = expiryDate;
    }

    public void processPayment() 
    {
        System.out.println("Credit Card Payment Processed Successfully.");
    }

    public void displayPaymentDetails() 
    {
        System.out.println("\nCredit Card Payment Details");
        System.out.println("Card Holder: " + cardHolder);
        System.out.println("Card Number: " + cardNumber);
        System.out.println("Expiry Date: " + expiryDate);
        System.out.println("Amount Paid: " + amount);
    }
}

class DebitCardPayment extends Payment 
{
    int pin;

    public DebitCardPayment(String cardNumber, String cardHolder, double amount, int pin) 
    {
        super(cardNumber, cardHolder, amount);
        this.pin = pin;
    }

    public void processPayment() 
    {
        System.out.println("Debit Card Payment Processed Successfully.");
    }

    public void displayPaymentDetails() 
    {
        System.out.println("\nDebit Card Payment Details ");
        System.out.println("Card Holder: " + cardHolder);
        System.out.println("Card Number: " + cardNumber);
        System.out.println("PIN: **** (Hidden for security)");
        System.out.println("Amount Paid: " + amount);
    }
}

public class Main3
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Credit Card Number: ");
        String creditCardNum = sc.nextLine();
        System.out.print("Enter Card Holder Name: ");
        String creditHolder = sc.nextLine();
        System.out.print("Enter Amount: ");
        double creditAmount = sc.nextDouble();
        sc.nextLine(); 
        System.out.print("Enter Expiry Date (MM/YY): ");
        String expiryDate = sc.nextLine();

        CreditCardPayment creditPayment = new CreditCardPayment(creditCardNum, creditHolder, creditAmount, expiryDate);
        creditPayment.processPayment();
        creditPayment.displayPaymentDetails();

        // Debit Card Payment
        System.out.print("\nEnter Debit Card Number: ");
        String debitCardNum = sc.nextLine();
        System.out.print("Enter Card Holder Name: ");
        String debitHolder = sc.nextLine();
        System.out.print("Enter Amount: ");
        double debitAmount = sc.nextDouble();
        System.out.print("Enter PIN (4-digit): ");
        int pin = sc.nextInt();

        DebitCardPayment debitPayment = new DebitCardPayment(debitCardNum, debitHolder, debitAmount, pin);
        debitPayment.processPayment();
        debitPayment.displayPaymentDetails();

        sc.close();
    }
}
