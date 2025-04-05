
import java.util.Scanner;

public class StudentGradeCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input for the number of students
        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();

        // Multi-dimensional array to store marks, percentage, and grade
        double[][] studentData = new double[n][4]; // 3 for subjects + 1 for percentage
        String[] grades = new String[n];

        // Taking input for marks in Physics, Chemistry, and Maths
        for (int i = 0; i < n; i++) {
            System.out.println("Enter marks for Student " + (i + 1) + ":");
            for (int j = 0; j < 3; j++) {
                do {
                    System.out.print((j == 0 ? "Physics" : j == 1 ? "Chemistry" : "Maths") + " (0-100): ");
                    studentData[i][j] = scanner.nextDouble();
                    if (studentData[i][j] < 0 || studentData[i][j] > 100) {
                        System.out.println("Marks should be between 0 and 100. Please enter again.");
                    }
                } while (studentData[i][j] < 0 || studentData[i][j] > 100);
            }
        }

        // Calculating percentage and determining grade
        for (int i = 0; i < n; i++) {
            studentData[i][3] = (studentData[i][0] + studentData[i][1] + studentData[i][2]) / 3; // Percentage
            if (studentData[i][3] >= 80) {
                grades[i] = "A";
            } else if (studentData[i][3] >= 70) {
                grades[i] = "B";
            } else if (studentData[i][3] >= 60) {
                grades[i] = "C";
            } else if (studentData[i][3] >= 50) {
                grades[i] = "D";
            } else if (studentData[i][3] >= 40) {
                grades[i] = "E";
            } else {
                grades[i] = "R";
            }
        }

        // Displaying results
        System.out.println("\nStudent | Physics | Chemistry | Maths | Percentage | Grade");
        System.out.println("---------------------------------------------------------");
        for (int i = 0; i < n; i++) {
            System.out.printf("%7d | %7.2f | %9.2f | %5.2f | %10.2f | %s\n", (i + 1), studentData[i][0], studentData[i][1], studentData[i][2], studentData[i][3], grades[i]);
        }

        scanner.close();
    }
}

