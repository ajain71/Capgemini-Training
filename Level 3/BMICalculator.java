import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args) {
        // Step 1: Get user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter weight (kg): ");
        double weight = scanner.nextDouble();
        
        System.out.print("Enter height (cm): ");
        double heightCm = scanner.nextDouble();
        scanner.close();
        
        // Step 2: Convert height from cm to meters
        double heightM = heightCm / 100;
        
        // Step 3: Calculate BMI
        double bmi = weight / (heightM * heightM);
        
        // Step 4: Determine weight status
        String status;
        if (bmi <= 18.4) {
            status = "Underweight";
        } else if (bmi <= 24.9) {
            status = "Normal";
        } else if (bmi <= 39.9) {
            status = "Overweight";
        } else {
            status = "Obese";
        }
        
        // Step 5: Display results
        System.out.println("\nBMI: " + bmi);
        System.out.println("Weight Status: " + status);
    }
}

