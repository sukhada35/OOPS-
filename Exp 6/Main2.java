// WAP to create an abstract class called MobileRechargePlan with attributes like planName, planAmount, and validityDays alongside abstract methods displayPlanDetails() and //calculateRechargeAmount(double talkTime). Further, create two concrete classes as prepaidRecharge and PostpaidRecharge extending the MobileRechargePlan class, provide methods for display //the plan details, and calculate the recharge amount methods. Instantiate both the classes and display their respective plan details along with calculate recharge amounts. 
// [Hint: use the abstract class, constructor, super and this keyword]

import java.util.Scanner;

abstract class MobileRechargePlan 
{
    String planName;
    double planAmount;
    int validityDays;

    public MobileRechargePlan(String planName, double planAmount, int validityDays)
    {
	this.planName = planName;
	this.planAmount = planAmount;
	this.validityDays = validityDays;
    }

    abstract void displayPlanDetails();
    abstract double calculateRechargeAmount(double talkTime);
}

class prepaidRecharge extends MobileRechargePlan
{
    public prepaidRecharge(String planName, double planAmount, int validityDays) 
    {
    	super(planName, planAmount, validityDays);
    }

    public void displayPlanDetails()
    {
	System.out.println("Prepaid Recharge Plan");
	System.out.println("Plan Name: " + planName);
	System.out.println("Amount: " + planAmount);
	System.out.println("Validity: " + validityDays + " days");	
    }

    public double calculateRechargeAmount(double talkTime) 
    {
        return planAmount + (talkTime * 1.5); // Adding ₹1.5 per minute of talk time
    }
}

class postpaidRecharge extends MobileRechargePlan {

    public postpaidRecharge(String planName, double planAmount, int validityDays) 
    {
        super(planName, planAmount, validityDays);
    }

    public void displayPlanDetails() {
        System.out.println("Postpaid Recharge Plan");
        System.out.println("Plan Name: " + planName);
        System.out.println("Monthly Rental: " + planAmount);
        System.out.println("Validity: " + validityDays + " days");
    }

    public double calculateRechargeAmount(double talkTime) 
    {
        return planAmount + (talkTime * 1.2); 
    }
}

public class Main2 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Prepaid Plan Name: ");
        String prepaidName = sc.nextLine();
        System.out.print("Enter Prepaid Plan Amount: ");
        double prepaidAmount = sc.nextDouble();
        System.out.print("Enter Prepaid Plan Validity (days): ");
        int prepaidValidity = sc.nextInt();
        System.out.print("Enter talk time used (minutes): ");
        double prepaidTalkTime = sc.nextDouble();

        // Creating PrepaidRecharge Object
        prepaidRecharge prepaid = new prepaidRecharge(prepaidName, prepaidAmount, prepaidValidity);
        prepaid.displayPlanDetails();
        System.out.println("Total Recharge Amount: " + prepaid.calculateRechargeAmount(prepaidTalkTime));

        sc.nextLine(); // Consume newline

        // Taking input for Postpaid Plan
        System.out.print("\nEnter Postpaid Plan Name: ");
        String postpaidName = sc.nextLine();
        System.out.print("Enter Postpaid Monthly Rental: ");
        double postpaidAmount = sc.nextDouble();
        System.out.print("Enter Postpaid Plan Validity (days): ");
        int postpaidValidity = sc.nextInt();
        System.out.print("Enter talk time used (minutes): ");
        double postpaidTalkTime = sc.nextDouble();

        // Creating PostpaidRecharge Object
        postpaidRecharge postpaid = new postpaidRecharge(postpaidName, postpaidAmount, postpaidValidity);
        postpaid.displayPlanDetails();
        System.out.println("Total Bill Amount: " + postpaid.calculateRechargeAmount(postpaidTalkTime));

        sc.close(); // Close Scanner
    }
}



