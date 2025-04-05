
import java.util.Random;

public class EmployeeBonusCalculator {
    
    // Method to generate random salaries and years of service
    public static double[][] generateEmployeeData(int numEmployees) {
        Random rand = new Random();
        double[][] employeeData = new double[numEmployees][2];

        for (int i = 0; i < numEmployees; i++) {
            employeeData[i][0] = 10000 + rand.nextInt(90000); // Random 5-digit salary
            employeeData[i][1] = rand.nextInt(11); // Years of service (0-10)
        }
        return employeeData;
    }

    // Method to calculate new salary and bonus
    public static double[][] calculateBonus(double[][] employeeData) {
        double[][] updatedData = new double[employeeData.length][3]; // Stores old salary, bonus, new salary

        for (int i = 0; i < employeeData.length; i++) {
            double oldSalary = employeeData[i][0];
            int yearsOfService = (int) employeeData[i][1];
            double bonus = (yearsOfService > 5) ? oldSalary * 0.05 : oldSalary * 0.02;
            double newSalary = oldSalary + bonus;

            updatedData[i][0] = oldSalary;
            updatedData[i][1] = bonus;
            updatedData[i][2] = newSalary;
        }
        return updatedData;
    }

    // Method to calculate totals and display in tabular format
    public static void displaySalaryTable(double[][] employeeData, double[][] updatedData) {
        double totalOldSalary = 0, totalBonus = 0, totalNewSalary = 0;

        System.out.println("-------------------------------------------------------------");
        System.out.println("EmpID | Old Salary  | Years of Service | Bonus    | New Salary");
        System.out.println("-------------------------------------------------------------");

        for (int i = 0; i < employeeData.length; i++) {
            totalOldSalary += updatedData[i][0];
            totalBonus += updatedData[i][1];
            totalNewSalary += updatedData[i][2];

            System.out.printf("%-5d | %-11.2f | %-15d | %-8.2f | %-11.2f\n", 
                i + 1, updatedData[i][0], (int) employeeData[i][1], updatedData[i][1], updatedData[i][2]);
        }

        System.out.println("-------------------------------------------------------------");
        System.out.printf("TOTAL  | %-11.2f | %-15s | %-8.2f | %-11.2f\n", 
                totalOldSalary, "-", totalBonus, totalNewSalary);
        System.out.println("-------------------------------------------------------------");
    }

    public static void main(String[] args) {
        int numEmployees = 10;
        double[][] employeeData = generateEmployeeData(numEmployees);
        double[][] updatedData = calculateBonus(employeeData);
        displaySalaryTable(employeeData, updatedData);
    }
}

