// 5.	Write a Java program to demonstrate the use of the LinkedList class in the Java Collection 
// Framework and traverse it using an Iterator. 

// import java.util.LinkedList;
// import java.util.Iterator;
import java.util.*; 
public class task5 {

    public static void main(String[] args) {
        // Creating a LinkedList to store String values
        LinkedList<String> list = new LinkedList<>();

        // Adding elements to the LinkedList
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Date");
        list.add("Elderberry");

        // Creating an Iterator for the LinkedList
        Iterator<String> iterator = list.iterator();

        // Traversing the LinkedList using the Iterator
        System.out.println("LinkedList elements:");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

