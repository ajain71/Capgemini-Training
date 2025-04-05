import java.util.Scanner;

public class DigitFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for the number
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        int[] frequency = new int[10]; // Array to store frequency of digits (0-9)

        // Extract digits and count frequency
        int temp = Math.abs(number); // Handle negative numbers
        while (temp > 0) {
            int digit = temp % 10; // Get last digit
            frequency[digit]++; // Increase frequency count
            temp /= 10; // Remove last digit
        }

        // Display frequency of each digit
        System.out.println("Digit Frequencies:");
        for (int i = 0; i < 10; i++) {
            if (frequency[i] > 0) {
                System.out.println("Digit " + i + " appears " + frequency[i] + " times.");
            }
        }

        scanner.close();
    }
}

