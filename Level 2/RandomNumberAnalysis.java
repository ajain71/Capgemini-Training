import java.util.Random;
import java.util.Arrays;

public class RandomNumberAnalysis {
    
    // Method to generate an array of 4-digit random numbers
    public static int[] generate4DigitRandomArray(int size) {
        Random random = new Random();
        int[] numbers = new int[size];
        
        for (int i = 0; i < size; i++) {
            numbers[i] = random.nextInt(9000) + 1000; // Generates a 4-digit number
        }
        return numbers;
    }
    
    // Method to find the average, min, and max values of an array
    public static double[] findAverageMinMax(int[] numbers) {
        int sum = 0;
        int min = numbers[0];
        int max = numbers[0];
        
        for (int num : numbers) {
            sum += num;
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        
        double average = (double) sum / numbers.length;
        return new double[]{average, min, max};
    }
    
    public static void main(String[] args) {
        int size = 5; // Generate five numbers
        int[] randomNumbers = generate4DigitRandomArray(size);
        
        System.out.println("Generated numbers: " + Arrays.toString(randomNumbers));
        
        double[] results = findAverageMinMax(randomNumbers);
        System.out.println("Average: " + results[0]);
        System.out.println("Minimum: " + results[1]);
        System.out.println("Maximum: " + results[2]);
    }
}

