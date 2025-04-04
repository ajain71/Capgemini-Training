
import java.util.Scanner;

public class HarshadNumberCheck {
    public static void main(String[] args) {
        // Step 1: Get user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();
        
        // Step 2: Initialize sum variable and store original number
        int sum = 0;
        int originalNumber = number;
        
        // Step 3: Calculate sum of digits
        while (originalNumber != 0) {
            int digit = originalNumber % 10; // Extract last digit
            sum += digit; // Add digit to sum
            originalNumber /= 10; // Remove last digit
        }
        
        // Step 4: Check divisibility
        if (number % sum == 0) {
            System.out.println(number + " is a Harshad Number.");
        } else {
            System.out.println(number + " is not a Harshad Number.");
        }
    }
}

