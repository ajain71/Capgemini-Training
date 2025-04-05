
import java.util.Scanner;

public class EmployeeBonusCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        final int EMPLOYEES = 10;
        double[] salaries = new double[EMPLOYEES];
        double[] yearsOfService = new double[EMPLOYEES];
        double[] newSalaries = new double[EMPLOYEES];
        double[] bonuses = new double[EMPLOYEES];
        
        double totalBonus = 0.0, totalOldSalary = 0.0, totalNewSalary = 0.0;
        
        // Input salaries and years of service
        for (int i = 0; i < EMPLOYEES; i++) {
            while (true) {
                System.out.print("Enter salary for employee " + (i + 1) + ": ");
                double salary = scanner.nextDouble();
                
                System.out.print("Enter years of service for employee " + (i + 1) + ": ");
                double years = scanner.nextDouble();
                
                if (salary > 0 && years >= 0) {
                    salaries[i] = salary;
                    yearsOfService[i] = years;
                    break;
                } else {
                    System.out.println("Invalid input. Salary must be positive and years of service cannot be negative. Try again.");
                }
            }
        }
        
        // Calculate bonuses and new salaries
        for (int i = 0; i < EMPLOYEES; i++) {
            double bonusPercentage = (yearsOfService[i] > 5) ? 0.05 : 0.02;
            bonuses[i] = salaries[i] * bonusPercentage;
            newSalaries[i] = salaries[i] + bonuses[i];
            
            totalBonus += bonuses[i];
            totalOldSalary += salaries[i];
            totalNewSalary += newSalaries[i];
        }
        
        // Display results
        System.out.println("\nEmployee Salary Details:");
        for (int i = 0; i < EMPLOYEES; i++) {
            System.out.println("Employee " + (i + 1) + " - Old Salary: " + salaries[i] + ", Bonus: " + bonuses[i] + ", New Salary: " + newSalaries[i]);
        }
        
        System.out.println("\nTotal Bonus Payout: " + totalBonus);
        System.out.println("Total Old Salary: " + totalOldSalary);
        System.out.println("Total New Salary: " + totalNewSalary);
        
        scanner.close();
    }
}

