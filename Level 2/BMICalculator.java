import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfPersons = 10;
        double[][] personData = new double[numberOfPersons][3]; // Weight, Height, BMI
        String[] bmiStatus = new String[numberOfPersons];

        // Taking input for weight and height
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.println("Enter details for Person " + (i + 1) + ":");
            System.out.print("Weight (kg): ");
            personData[i][0] = scanner.nextDouble();
            System.out.print("Height (cm): ");
            personData[i][1] = scanner.nextDouble();
        }

        // Calculate BMI and determine status
        calculateBMI(personData);
        bmiStatus = determineBMIStatus(personData);

        // Display results
        System.out.println("\nPerson | Weight (kg) | Height (cm) | BMI | Status");
        System.out.println("------------------------------------------------------");
        for (int i = 0; i < numberOfPersons; i++) {
            System.out.printf("%6d | %10.2f | %10.2f | %5.2f | %s\n", (i + 1), personData[i][0], personData[i][1], personData[i][2], bmiStatus[i]);
        }

        scanner.close();
    }

    // Method to calculate BMI
    public static void calculateBMI(double[][] data) {
        for (int i = 0; i < data.length; i++) {
            double heightInMeters = data[i][1] / 100; // Convert cm to meters
            data[i][2] = data[i][0] / (heightInMeters * heightInMeters);
        }
    }

    // Method to determine BMI status
    public static String[] determineBMIStatus(double[][] data) {
        String[] status = new String[data.length];
        for (int i = 0; i < data.length; i++) {
            double bmi = data[i][2];
            if (bmi <= 18.4) {
                status[i] = "Underweight";
            } else if (bmi <= 24.9) {
                status[i] = "Normal";
            } else if (bmi <= 39.9) {
                status[i] = "Overweight";
            } else {
                status[i] = "Obese";
            }
        }
        return status;
    }
}

