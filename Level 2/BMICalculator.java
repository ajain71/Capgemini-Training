import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for the number of persons
        System.out.print("Enter the number of persons: ");
        int n = scanner.nextInt();

        // Arrays to store height, weight, BMI, and weight status
        double[] height = new double[n];
        double[] weight = new double[n];
        double[] bmi = new double[n];
        String[] status = new String[n];

        // Taking input for height and weight
        for (int i = 0; i < n; i++) {
            System.out.print("Enter height (in cm) of person " + (i + 1) + ": ");
            height[i] = scanner.nextDouble() / 100; // Convert cm to meters
            System.out.print("Enter weight (in kg) of person " + (i + 1) + ": ");
            weight[i] = scanner.nextDouble();
        }

        // Calculating BMI and determining weight status
        for (int i = 0; i < n; i++) {
            bmi[i] = weight[i] / (height[i] * height[i]);
            if (bmi[i] <= 18.4) {
                status[i] = "Underweight";
            } else if (bmi[i] <= 24.9) {
                status[i] = "Normal";
            } else if (bmi[i] <= 39.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }

        // Displaying results
        System.out.println("\nPerson | Height (m) | Weight (kg) | BMI  | Status");
        for (int i = 0; i < n; i++) {
            System.out.printf("%6d | %10.2f | %10.2f | %5.2f | %s\n", (i + 1), height[i], weight[i], bmi[i], status[i]);
        }

        scanner.close();
    }
}

