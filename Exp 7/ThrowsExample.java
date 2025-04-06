import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ThrowsExample {
    // Method that throws IOException
    public static String readInput() throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter a message: ");
        return reader.readLine(); // Might throw IOException
    }

    public static void main(String[] args) {
        try {
            String message = readInput();
            System.out.println("You entered: " + message);
        } 
        catch (IOException e) 
        {
            System.out.println("Error reading input: " + e.getMessage());
        } 
        finally {
            System.out.println("Execution complete.");
        }
    }
}
