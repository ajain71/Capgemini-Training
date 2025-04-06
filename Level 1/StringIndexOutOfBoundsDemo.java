
import java.util.Scanner;

public class StringIndexOutOfBoundsDemo {
    
    // Method to generate StringIndexOutOfBoundsException
    public static void generateException(String str) {
        // Accessing an index beyond the string length
        System.out.println("Character at out-of-bounds index: " + str.charAt(str.length())); // This will throw an exception
    }
    
    // Method to handle StringIndexOutOfBoundsException
    public static void handleException(String str) {
        try {
            System.out.println("Character at out-of-bounds index: " + str.charAt(str.length()));
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println("StringIndexOutOfBoundsException caught! Index is out of bounds.");
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking input from user
        System.out.print("Enter a string: ");
        String input = scanner.next();
        
        // Uncomment to see the exception occur
        // generateException(input);
        
        // Calling the method that handles the exception
        handleException(input);
        
        scanner.close();
    }
}

