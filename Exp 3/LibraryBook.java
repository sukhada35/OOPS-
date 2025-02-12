import java.util.Scanner;

class LibraryBook
{
    String title;
    String author;
    double price;

    public void displayDetails()
    {
	System.out.println("Book Title: " + title);
	System.out.println("Author: " + author);
	System.out.println("Price: " + price);
    }

    public void acceptDetails()
    {
	Scanner sc = new Scanner(System.in);

	System.out.print("Enter the title of the book: ");
	title = sc.nextLine();

	System.out.print("Enter the author of the book: ");
	author = sc.nextLine();

	System.out.print("Enter the price of the book: ");
	price = sc.nextDouble();
    }

    
    public static void main(String[] args) 
    {
        LibraryBook book = new LibraryBook();

        book.acceptDetails();

        book.displayDetails();
    }
}