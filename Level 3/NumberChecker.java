
import java.util.Arrays;
import java.util.Random;

public class NumberChecker {
    public static void main(String[] args) {
        // Generate a random number between 1 and 1000
        Random random = new Random();
        int number = random.nextInt(1000) + 1; 

        System.out.println("Randomly Generated Number: " + number);

        // Finding factors
        int[] factors = findFactors(number);
        System.out.println("Factors: " + Arrays.toString(factors));

        // Various calculations using factors
        System.out.println("Greatest Factor: " + findGreatestFactor(factors));
        System.out.println("Sum of Factors: " + findSumOfFactors(factors));
        System.out.println("Product of Factors: " + findProductOfFactors(factors));
        System.out.println("Product of Cubes of Factors: " + findProductOfCubesOfFactors(factors));

        // Checking special number types
        System.out.println("Is Perfect Number: " + isPerfectNumber(number));
        System.out.println("Is Abundant Number: " + isAbundantNumber(number));
        System.out.println("Is Deficient Number: " + isDeficientNumber(number));
        System.out.println("Is Strong Number: " + isStrongNumber(number));
    }

    // Method to find factors of a number
    public static int[] findFactors(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) count++;
        }

        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index++] = i;
            }
        }
        return factors;
    }

    // Method to find the greatest factor (excluding the number itself)
    public static int findGreatestFactor(int[] factors) {
        return factors[factors.length - 2]; // Second last element before the number itself
    }

    // Method to find the sum of factors
    public static int findSumOfFactors(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    // Method to find the product of factors
    public static int findProductOfFactors(int[] factors) {
        int product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    // Method to find the product of cubes of factors
    public static double findProductOfCubesOfFactors(int[] factors) {
        double product = 1;
        for (int factor : factors) {
            product *= Math.pow(factor, 3);
        }
        return product;
    }

    // Method to check if a number is a perfect number
    public static boolean isPerfectNumber(int number) {
        return findSumOfFactors(findFactors(number)) - number == number;
    }

    // Method to check if a number is an abundant number
    public static boolean isAbundantNumber(int number) {
        return findSumOfFactors(findFactors(number)) - number > number;
    }

    // Method to check if a number is a deficient number
    public static boolean isDeficientNumber(int number) {
        return findSumOfFactors(findFactors(number)) - number < number;
    }

    // Method to check if a number is a strong number
    public static boolean isStrongNumber(int number) {
        int sum = 0;
        int temp = number;
        while (temp > 0) {
            sum += factorial(temp % 10);
            temp /= 10;
        }
        return sum == number;
    }

    // Helper method to calculate factorial
    private static int factorial(int n) {
        return (n == 0 || n == 1) ? 1 : n * factorial(n - 1);
    }
}

