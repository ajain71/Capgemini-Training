
import java.util.Scanner;

public class FactorialCalculatorforloop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a positive integer: ");
        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            
            if (n >= 0) {
                long factorial = 1;
                
                for (int i = 1; i <= n; i++) {
                    factorial *= i;
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

