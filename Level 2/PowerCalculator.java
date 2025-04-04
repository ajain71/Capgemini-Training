
import java.util.Scanner;

public class PowerCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a positive integer (base): ");
        int number = scanner.nextInt();
        
        System.out.print("Enter a positive integer (exponent): ");
        int power = scanner.nextInt();
        
        if (number > 0 && power >= 0) {
            int result = 1;
            for (int i = 1; i <= power; i++) {
                result *= number;
            }
            System.out.println(number + " raised to the power of " + power + " is: " + result);
        } else {
            System.out.println("Please enter valid positive integers for base and a non-negative integer for exponent.");
        }
        
        scanner.close();
    }
}

