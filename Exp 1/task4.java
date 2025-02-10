import java.util.Scanner;

public class StudentInfo
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter ur name: ");
        String name = sc.nextLine();

        System.out.print("Enter age: ");
        int age = sc.nextInt();

        System.out.print("Enter phone no.: ");
        long phone = sc.nextLong();

        System.out.print("Enter marks 1: ");
        int marks1 = sc.nextInt();

        System.out.print("Enter marks 2: ");
        int marks2 = sc.nextInt();

        double avg = (marks1 + marks2) / 2.0;

        System.out.print("Name: " + name);
        System.out.print("Age: " + age);
        System.out.print("Phone: " + phone);
        System.out.print("Average: " + avg);

        public static void main(String[]args)
        {
            Q2 obj = new Q2();
            Eligible student = obj.new Eligible();
        }
    }
}