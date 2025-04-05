
import java.util.Scanner;

public class NumberCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        // Taking user input for the numbers
        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Checking number properties
        for (int num : numbers) {
            if (num > 0) {
                if (num % 2 == 0) {
                    System.out.println("The number " + num + " is positive and even.");
                } else {
                    System.out.println("The number " + num + " is positive and odd.");
                }
            } else if (num < 0) {
                System.out.println("The number " + num + " is negative.");
            } else {
                System.out.println("The number is zero.");
            }
        }

        // Comparing first and last elements
        if (numbers[0] > numbers[4]) {
            System.out.println("The first number " + numbers[0] + " is greater than the last number " + numbers[4] + ".");
        } else if (numbers[0] < numbers[4]) {
            System.out.println("The first number " + numbers[0] + " is less than the last number " + numbers[4] + ".");
        } else {
            System.out.println("The first number and the last number are equal.");
        }

        scanner.close();
    }
}

