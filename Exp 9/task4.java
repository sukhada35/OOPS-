// 4.	Write the above program using for-each loop. 
import java.util.*;

public class task4 {
    public static void main(String[] args) {
        // Creating an ArrayList of subjects
        ArrayList<String> subjects = new ArrayList<>();

        // Adding elements
        subjects.add("Java");
        subjects.add("Python");
        subjects.add("DSA");
        subjects.add("DBMS");

        // Traversing using for-each loop
        System.out.println("Traversing ArrayList using for-each loop:");
        for (String subject : subjects) {
            System.out.println(subject);
        }
    }
}
