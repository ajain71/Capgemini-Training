
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class FactorAnalysis {
    
    // Method to find the factors of a number
    public static int[] findFactors(int number) {
        List<Integer> factorList = new ArrayList<>();
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factorList.add(i);
            }
        }
        return factorList.stream().mapToInt(i -> i).toArray();
    }

    // Method to calculate the sum of factors
    public static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    // Method to calculate the product of factors
    public static long productOfFactors(int[] factors) {
        long product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    // Method to calculate the sum of the squares of factors
    public static int sumOfSquaresOfFactors(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += Math.pow(factor, 2);
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking user input
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        // Finding factors
        int[] factors = findFactors(number);
        
        // Calculating required values
        int sum = sumOfFactors(factors);
        long product = productOfFactors(factors);
        int sumOfSquares = sumOfSquaresOfFactors(factors);
        
        // Displaying results
        System.out.println("Factors: ");
        for (int factor : factors) {
            System.out.print(factor + " ");
        }
        System.out.println();
        System.out.println("Sum of factors: " + sum);
        System.out.println("Product of factors: " + product);
        System.out.println("Sum of squares of factors: " + sumOfSquares);
        
        scanner.close();
    }
}

