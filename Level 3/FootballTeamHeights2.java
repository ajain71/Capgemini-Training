
import java.util.Random;

public class FootballTeamHeights2 {
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
        System.out.println("Sum of Digits: " + NumberChecker.sumOfDigits(digits));
        System.out.println("Sum of Squares of Digits: " + NumberChecker.sumOfSquaresOfDigits(digits));
        System.out.println("Is Harshad Number: " + NumberChecker.isHarshadNumber(digits, number));
        NumberChecker.findDigitFrequency(number);
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

    // Method to find the sum of the digits of a number
    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += digit;
        }
        return sum;
    }

    // Method to find the sum of the squares of the digits of a number
    public static int sumOfSquaresOfDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, 2);
        }
        return sum;
    }

    // Method to check if a number is a Harshad number
    public static boolean isHarshadNumber(int[] digits, int number) {
        int sum = sumOfDigits(digits);
        return number % sum == 0;
    }

    // Method to find the frequency of each digit in a number
    public static void findDigitFrequency(int number) {
        int[] freq = new int[10]; // To store frequency of digits 0-9
        while (number > 0) {
            freq[number % 10]++;
            number /= 10;
        }
        System.out.println("Digit Frequency:");
        for (int i = 0; i < 10; i++) {
            if (freq[i] > 0) {
                System.out.println("Digit " + i + "    " + freq[i]);
            }
        }
    }
}

