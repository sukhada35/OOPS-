// import java.util.LinkedList;
import java.util.*; 
public class task6 {

    public static void main(String[] args) {
        // Creating a LinkedList to store String values
        LinkedList<String> list = new LinkedList<>();

        // Adding elements to the LinkedList
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Date");
        list.add("Elderberry");

        // Traversing the LinkedList using the for-each loop
        System.out.println("LinkedList elements:");
        for (String i : list) {
            // The for-each loop automatically retrieves each element in the list
            System.out.println(i);
        }
    }
}
