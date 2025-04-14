// 3.	Write a Java program to demonstrate the use of the ArrayList class in the Java Collection 
//      Framework and traverse it using an Iterator. 

import java.util.*;

public class task3 {
    public static void main(String[] args) {
        // Creating an ArrayList of subjects
        ArrayList<String> subjects = new ArrayList<>();

        // Adding elements to the list
        subjects.add("Java");
        subjects.add("Python");
        subjects.add("DSA");
        subjects.add("DBMS");

        // Traversing using Iterator
        System.out.println("Traversing ArrayList using Iterator:");
        Iterator<String> iterator = subjects.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
