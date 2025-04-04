
import java.util.Scanner;

public class AbundantNumberCheck {
    public static void main(String[] args) {
        // Step 1: Get user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();
        
        // Step 2: Initialize sum variable
        int sum = 0;
        
        // Step 3: Calculate sum of divisors
        for (int i = 1; i < number; i++) {
            if (number % i == 0) { // Check if i is a divisor
                sum += i; // Add divisor to sum
            }
        }
        
        // Step 4: Check if sum is greater than number
        if (sum > number) {
            System.out.println(number + " is an Abundant Number.");
        } else {
            System.out.println(number + " is not an Abundant Number.");
        }
    }
}

