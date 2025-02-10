import java.util.Scanner;

public class task4 {
    
    public void mainf() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = sc.nextLine();

        System.out.println("Enter age: ");
        int age = sc.nextInt();

        System.out.println("Enter phone no.: ");
        long phone = sc.nextLong();

        System.out.println("Enter marks 1: ");
        int marks1 = sc.nextInt();

        System.out.println("Enter marks 2: ");
        int marks2 = sc.nextInt();

        double avg = (marks1 + marks2) / 2.0;

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Phone: " + phone);
        System.out.println("Average: " + avg);

        sc.close();
    }

    public static void main(String[] args) {
        task4 obj = new task4(); // Creating an object of Task4
        obj.mainf(); // Calling the function
    }
}