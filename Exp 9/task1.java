//1. Write a Java program to demonstrate basic CRUD (Create, Read, Update, Delete) operations on a list 
// using the methods provided by the List interface. 
import java.util.*;

public class task1 {
    public static void main(String[] args) 
    {
        List<String> students = new ArrayList<>();

        // Create
        students.add("Sukhada");
        students.add("Ashmit");
        students.add("Neerav");
        students.add("Tanay");

        // Read
        System.out.println("Original List: " + students);

        // Update
        students.set(1, "Ash"); 
        System.out.println("After Update: " + students);

        // Delete
        students.remove("Tanay");
        System.out.println("After Delete: " + students);
    }
}
