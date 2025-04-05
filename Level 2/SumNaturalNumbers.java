
import java.util.Scanner;

public class SumNaturalNumbers {
    
    // Method to find the sum of n natural numbers using recursion
    public static int sumUsingRecursion(int n) {
        if (n == 1) {
            return 1;
        }
        return n + sumUsingRecursion(n - 1);
    }

    // Method to find the sum of n natural numbers using formula
    public static int sumUsingFormula(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking user input
        System.out.print("Enter a natural number: ");
        int n = scanner.nextInt();
        
        if (n <= 0) {
            System.out.println("Please enter a natural number (greater than 0). Exiting program.");
            return;
        }
        
        // Calculating sum using both methods
        int sumRecursion = sumUsingRecursion(n);
        int sumFormula = sumUsingFormula(n);
        
        // Displaying results
        System.out.println("Sum using recursion: " + sumRecursion);
        System.out.println("Sum using formula: " + sumFormula);
        
        // Comparing results
        if (sumRecursion == sumFormula) {
            System.out.println("Both computations give the same result. The formula is correct.");
        } else {
            System.out.println("There is a discrepancy in the results. Please check the implementation.");
        }
        
        scanner.close();
    }
}

