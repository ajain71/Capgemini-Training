
import java.util.Scanner;

public class IllegalArgumentExceptionDemo {
    
    // Method to generate IllegalArgumentException
    public static void generateException(String str, int start, int end) {
        // Attempt to create a substring with an invalid range
        System.out.println("Substring: " + str.substring(start, end)); // This will throw an exception
    }
    
    // Method to handle IllegalArgumentException
    public static void handleException(String str, int start, int end) {
        try {
            System.out.println("Substring: " + str.substring(start, end));
        } catch (IllegalArgumentException e) {
            System.out.println("IllegalArgumentException caught! Start index cannot be greater than end index.");
        } catch (RuntimeException e) {
            System.out.println("RuntimeException caught! Invalid substring operation.");
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking input from user
        System.out.print("Enter a string: ");
        String input = scanner.next();
        
        System.out.print("Enter start index: ");
        int start = scanner.nextInt();
        
        System.out.print("Enter end index: ");
        int end = scanner.nextInt();
        
        // Uncomment to see the exception occur
        // generateException(input, start, end);
        
        // Calling the method that handles the exception
        handleException(input, start, end);
        
        scanner.close();
    }
}

