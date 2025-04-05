
import java.util.Arrays;
import java.util.Random;

public class FootballTeamHeights4 {
    public static void main(String[] args) {
        int[] heights = new int[11];
        Random random = new Random();
        
        // Generate random heights between 150 cm and 250 cm
        for (int i = 0; i < heights.length; i++) {
            heights[i] = random.nextInt(101) + 150; // Generates number between 150 and 250
        }
        
        // Display the heights
        System.out.print("Player Heights: ");
        for (int height : heights) {
            System.out.print(height + " ");
        }
        System.out.println();
        
        // Compute and display results
        System.out.println("Total Sum of Heights: " + findSum(heights));
        System.out.println("Mean Height: " + findMean(heights));
        System.out.println("Shortest Height: " + findShortest(heights));
        System.out.println("Tallest Height: " + findTallest(heights));
        
        // Testing NumberChecker Utility
        int number = 153; // Example number
        System.out.println("\nNumber: " + number);
        System.out.println("Digit Count: " + NumberChecker.countDigits(number));
        int[] digits = NumberChecker.getDigits(number);
        System.out.println("Reversed Digits: " + Arrays.toString(NumberChecker.reverseDigits(digits)));
        System.out.println("Is Palindrome: " + NumberChecker.isPalindrome(number));
        System.out.println("Is Duck Number: " + NumberChecker.isDuckNumber(digits));
        System.out.println("Is Prime Number: " + NumberChecker.isPrime(number));
        System.out.println("Is Neon Number: " + NumberChecker.isNeonNumber(number));
        System.out.println("Is Spy Number: " + NumberChecker.isSpyNumber(number));
        System.out.println("Is Automorphic Number: " + NumberChecker.isAutomorphic(number));
        System.out.println("Is Buzz Number: " + NumberChecker.isBuzzNumber(number));
    }

    // Method to find the sum of all elements
    public static int findSum(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

    // Method to calculate the mean height
    public static double findMean(int[] arr) {
        return (double) findSum(arr) / arr.length;
    }

    // Method to find the shortest height
    public static int findShortest(int[] arr) {
        int min = arr[0];
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }

    // Method to find the tallest height
    public static int findTallest(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
}

class NumberChecker {
    // Method to check if a number is prime
    public static boolean isPrime(int number) {
        if (number < 2) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }

    // Method to check if a number is a neon number
    public static boolean isNeonNumber(int number) {
        int square = number * number;
        int sum = 0;
        while (square > 0) {
            sum += square % 10;
            square /= 10;
        }
        return sum == number;
    }

    // Method to check if a number is a spy number
    public static boolean isSpyNumber(int number) {
        int[] digits = getDigits(number);
        int sum = 0, product = 1;
        for (int digit : digits) {
            sum += digit;
            product *= digit;
        }
        return sum == product;
    }

    // Method to check if a number is an automorphic number
    public static boolean isAutomorphic(int number) {
        int square = number * number;
        return String.valueOf(square).endsWith(String.valueOf(number));
    }

    // Method to check if a number is a buzz number
    public static boolean isBuzzNumber(int number) {
        return number % 7 == 0 || number % 10 == 7;
    }

    // Method to count the number of digits
    public static int countDigits(int number) {
        return String.valueOf(number).length();
    }

    // Method to store digits in an array
    public static int[] getDigits(int number) {
        String numStr = String.valueOf(number);
        int[] digits = new int[numStr.length()];
        for (int i = 0; i < numStr.length(); i++) {
            digits[i] = numStr.charAt(i) - '0';
        }
        return digits;
    }

    // Method to reverse the digits array
    public static int[] reverseDigits(int[] digits) {
        int[] reversed = new int[digits.length];
        for (int i = 0; i < digits.length; i++) {
            reversed[i] = digits[digits.length - 1 - i];
        }
        return reversed;
    }

    // Method to compare two arrays and check if they are equal
    public static boolean areArraysEqual(int[] arr1, int[] arr2) {
        return Arrays.equals(arr1, arr2);
    }

    // Method to check if a number is a palindrome using digits
    public static boolean isPalindrome(int number) {
        int[] digits = getDigits(number);
        int[] reversed = reverseDigits(digits);
        return areArraysEqual(digits, reversed);
    }

    // Method to check if a number is a Duck Number
    public static boolean isDuckNumber(int[] digits) {
        for (int i = 1; i < digits.length; i++) { // Skip the first digit
            if (digits[i] == 0) {
                return true;
            }
        }
        return false;
    }
}

