
import java.util.Scanner;

public class NumberAnalysis {

    // Method to check if a number is positive or negative
    public static boolean isPositive(int number) {
        return number >= 0;
    }

    // Method to check if a number is even or odd
    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    // Method to compare two numbers
    public static int compare(int number1, int number2) {
        if (number1 > number2) return 1;
        else if (number1 == number2) return 0;
        else return -1;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            if (isPositive(numbers[i])) {
                System.out.print("Number " + numbers[i] + " is Positive and ");
                System.out.println(isEven(numbers[i]) ? "Even." : "Odd.");
            } else {
                System.out.println("Number " + numbers[i] + " is Negative.");
            }
        }

        int comparisonResult = compare(numbers[0], numbers[4]);
        if (comparisonResult == 1) {
            System.out.println("First number is greater than the last number.");
        } else if (comparisonResult == 0) {
            System.out.println("First and last numbers are equal.");
        } else {
            System.out.println("First number is less than the last number.");
        }

        scanner.close();
    }
}

