import java.util.Scanner;

public class task3
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first no. ");
        int num1 = sc.nextInt();

        System.out.print("Enter the second no. ");
        int num2 = sc.nextInt();

        num1 = num1 + num2;
        num2 = num1 - num2;
        num1 = num1 - num2;

        System.out.print("After swapping: num1 = " + num1 + ", num2 = " + num2);
    }
}