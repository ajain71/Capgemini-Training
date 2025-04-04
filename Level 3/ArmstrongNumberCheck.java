
import java.util.Scanner;

public class ArmstrongNumberCheck {
    public static void main(String[] args) {
        // Step 1: Get user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();
        
        // Step 2: Initialize sum variable and store original number
        int sum = 0;
        int originalNumber = number;
        
        // Step 3: Process each digit
        while (originalNumber != 0) {
            int digit = originalNumber % 10; // Extract last digit
            sum += Math.pow(digit, 3); // Cube the digit and add to sum
            originalNumber /= 10; // Remove last digit
        }
        
        // Step 4: Check if sum matches original number
        if (sum == number) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }
}

