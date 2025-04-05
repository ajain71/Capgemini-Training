
import java.util.Scanner;

public class BMICalculatornew {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for the number of persons
        System.out.print("Enter the number of persons: ");
        int n = scanner.nextInt();

        // Multi-dimensional array to store height, weight, and BMI
        double[][] personData = new double[n][3];
        String[] weightStatus = new String[n];

        // Taking input for height and weight with validation
        for (int i = 0; i < n; i++) {
            do {
                System.out.print("Enter height (in cm) of person " + (i + 1) + ": ");
                personData[i][0] = scanner.nextDouble();
                if (personData[i][0] <= 0) {
                    System.out.println("Height must be positive. Please enter again.");
                }
            } while (personData[i][0] <= 0);
            
            do {
                System.out.print("Enter weight (in kg) of person " + (i + 1) + ": ");
                personData[i][1] = scanner.nextDouble();
                if (personData[i][1] <= 0) {
                    System.out.println("Weight must be positive. Please enter again.");
                }
            } while (personData[i][1] <= 0);
            
            // Convert height from cm to meters
            personData[i][0] /= 100;
        }

        // Calculating BMI and determining weight status
        for (int i = 0; i < n; i++) {
            personData[i][2] = personData[i][1] / (personData[i][0] * personData[i][0]);
            if (personData[i][2] <= 18.4) {
                weightStatus[i] = "Underweight";
            } else if (personData[i][2] <= 24.9) {
                weightStatus[i] = "Normal";
            } else if (personData[i][2] <= 39.9) {
                weightStatus[i] = "Overweight";
            } else {
                weightStatus[i] = "Obese";
            }
        }

        // Displaying results
        System.out.println("\nPerson | Height (m) | Weight (kg) | BMI  | Status");
        for (int i = 0; i < n; i++) {
            System.out.printf("%6d | %10.2f | %10.2f | %5.2f | %s\n", (i + 1), personData[i][0], personData[i][1], personData[i][2], weightStatus[i]);
        }

        scanner.close();
    }
}

