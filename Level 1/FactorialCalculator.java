
Print the factorial at the end.
import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a positive integer: ");
        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            
            if (n >= 0) {
                long factorial = 1;
                int counter = 1;
                
                while (counter <= n) {
                    factorial *= counter;
                    counter++;
                }
                
                System.out.println("The factorial of " + n + " is: " + factorial);
            } else {
                System.out.println("Please enter a non-negative integer.");
            }
        } else {
            System.out.println("Invalid input! Please enter a valid integer.");
        }
        
        scanner.close();
    }
}

