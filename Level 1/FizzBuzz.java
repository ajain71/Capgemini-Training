import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get user input
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();
        
        // Validate input
        if (number <= 0) {
            System.out.println("Error: Please enter a positive integer.");
            return;
        }
        
        // Create a String array to store results
        String[] results = new String[number + 1];
        
        // Loop from 0 to number and determine FizzBuzz values
        for (int i = 0; i <= number; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                results[i] = "FizzBuzz";
            } else if (i % 3 == 0) {
                results[i] = "Fizz";
            } else if (i % 5 == 0) {
                results[i] = "Buzz";
            } else {
                results[i] = String.valueOf(i);
            }
        }
        
        // Print results
        for (int i = 0; i <= number; i++) {
            System.out.println("Position " + i + " = " + results[i]);
        }
        
        scanner.close();
    }
}

