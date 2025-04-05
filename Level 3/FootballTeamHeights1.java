
import java.util.Random;

public class FootballTeamHeights1 {
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
        System.out.println("Is Duck Number: " + NumberChecker.isDuckNumber(digits));
        System.out.println("Is Armstrong Number: " + NumberChecker.isArmstrongNumber(digits, number));
        NumberChecker.findLargestAndSecondLargest(digits);
        NumberChecker.findSmallestAndSecondSmallest(digits);
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

    // Method to check if a number is a duck number
    public static boolean isDuckNumber(int[] digits) {
        for (int i = 1; i < digits.length; i++) {
            if (digits[i] == 0) return true;
        }
        return false;
    }

    // Method to check if a number is an Armstrong number
    public static boolean isArmstrongNumber(int[] digits, int number) {
        int sum = 0, power = digits.length;
        for (int digit : digits) {
            sum += Math.pow(digit, power);
        }
        return sum == number;
    }

    // Method to find the largest and second largest digits
    public static void findLargestAndSecondLargest(int[] digits) {
        int largest = Integer.MIN_VALUE, secondLargest = Integer.MIN_VALUE;
        for (int num : digits) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;
            }
        }
        System.out.println("Largest Digit: " + largest + ", Second Largest Digit: " + secondLargest);
    }

    // Method to find the smallest and second smallest digits
    public static void findSmallestAndSecondSmallest(int[] digits) {
        int smallest = Integer.MAX_VALUE, secondSmallest = Integer.MAX_VALUE;
        for (int num : digits) {
            if (num < smallest) {
                secondSmallest = smallest;
                smallest = num;
            } else if (num < secondSmallest && num != smallest) {
                secondSmallest = num;
            }
        }
        System.out.println("Smallest Digit: " + smallest + ", Second Smallest Digit: " + secondSmallest);
    }
}

