
import java.util.Scanner;

public class ArrayIndexOutOfBoundsExceptionDemo {
    
    // Method to generate ArrayIndexOutOfBoundsException
    public static void generateException(String[] names, int index) {
        // Attempt to access an index beyond the array length
        System.out.println("Name at index " + index + ": " + names[index]); // This will throw an exception
    }
    
    // Method to handle ArrayIndexOutOfBoundsException
    public static void handleException(String[] names, int index) {
        try {
            System.out.println("Name at index " + index + ": " + names[index]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught! Index is out of bounds.");
        } catch (RuntimeException e) {
            System.out.println("RuntimeException caught! Invalid array access.");
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Defining an array of names
        String[] names = {"Alice", "Bob", "Charlie", "David", "Eve"};
        
        System.out.print("Enter an index to access: ");
        int index = scanner.nextInt();
        
        // Uncomment to see the exception occur
        // generateException(names, index);
        
        // Calling the method that handles the exception
        handleException(names, index);
        
        scanner.close();
    }
}

