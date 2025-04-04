
import java.util.Scanner;

public class DigitCount {
    public static void main(String[] args) {
        // Step 1: Get user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();
        
        // Step 2: Initialize count variable
        int count = 0;
        
        // Step 3: Handle case when number is 0
        if (number == 0) {
            count = 1;
        } else {
            // Step 4: Count digits using loop
            while (number != 0) {
                number /= 10; // Remove last digit
                count++; // Increment count
            }
        }
        
        // Step 5: Display the count
        System.out.println("Number of digits: " + count);
    }
}

