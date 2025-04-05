
import java.util.Scanner;

public class StoreAndSumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numbers = new double[10];
        double total = 0.0;
        int index = 0;

        // Infinite loop to take user input
        while (true) {
            System.out.print("Enter a number (0 or negative to stop): ");
            double num = scanner.nextDouble();

            // Break conditions
            if (num <= 0 || index == 10) {
                break;
            }

            numbers[index] = num;
            index++;
        }

        // Calculate sum of numbers
        for (int i = 0; i < index; i++) {
            total += numbers[i];
        }

        // Display entered numbers and total sum
        System.out.println("Numbers entered:");
        for (int i = 0; i < index; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println("\nTotal sum: " + total);

        scanner.close();
    }
}

