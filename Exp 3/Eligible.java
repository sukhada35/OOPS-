import java.util.Scanner;

class Eligible
{
    int classHeld;
    int classAttended;

    public void input()
    {
	Scanner sc = new Scanner(System.in);

	Scanner.out.print("Enter the number of classes held: ");
	classHeld = sc.nextInt();

	Scanner.out.print("Enter the number of classes attended: ");
	classAttended = sc.nextInt();
    }

    public void compute()
    {
	if(classHeld == 0)
	{
	    System.out.print("Student permitted to apper in the exam.");
	}
	else
	{
	    System.out.print("Student not permitted to appear in the exam.")
	}
    }

    public static void main(String[] args) 
    {
        Eligible student = new Eligible();

        student.input();
        student.compute();
    }
}
