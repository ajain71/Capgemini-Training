
import java.util.Scanner;

public class NumberFormatExceptionDemo {
    
        public static void generateException(String text) {
       
        int number = Integer.parseInt(text);                               System.out.println("Converted number: " + number);
    }
    
        public static void handleException(String text) {
        try {
            int number = Integer.parseInt(text);
            System.out.println("Converted number: " + number);
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException caught! Invalid numeric format.");
        } catch (RuntimeException e) {
            System.out.println("RuntimeException caught! Error in number conversion.");
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
       
        System.out.print("Enter a string to convert to number: ");
        String input = scanner.next();
                handleException(input);
        
        scanner.close();
    }
}

