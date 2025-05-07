// 2.	Write a Java program to demonstrate the usage of the Set interface in the Java Collection Framework. 
import java.util.*;

public class task2 {
    public static void main(String[] args) {
        Set<String> uniqueNames = new HashSet<>();

        // Adding elements
        uniqueNames.add("Sukhada");
        uniqueNames.add("Ashmit");
        uniqueNames.add("Neerav");
        uniqueNames.add("Tanay");

        // Trying to add duplicate
        uniqueNames.add("Sukhada");

        // Displaying the set
        System.out.println("Unique Names: " + uniqueNames);
        
    }
}
