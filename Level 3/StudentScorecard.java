
import java.util.Random;
import java.util.Scanner;

public class StudentScorecard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take input for number of students
        System.out.print("Enter number of students: ");
        int numStudents = scanner.nextInt();

        // Generate random marks for each student
        int[][] marks = generateRandomMarks(numStudents);

        // Calculate total, average, and percentage
        double[][] scores = calculateScores(marks);

        // Display the scorecard
        displayScorecard(marks, scores);

        scanner.close();
    }

    // Method to generate random scores for Physics, Chemistry, and Math
    public static int[][] generateRandomMarks(int numStudents) {
        Random rand = new Random();
        int[][] marks = new int[numStudents][3];

        for (int i = 0; i < numStudents; i++) {
            marks[i][0] = rand.nextInt(41) + 60; // Physics (60-100)
            marks[i][1] = rand.nextInt(41) + 60; // Chemistry (60-100)
            marks[i][2] = rand.nextInt(41) + 60; // Math (60-100)
        }

        return marks;
    }

    // Method to calculate total, average, and percentage
    public static double[][] calculateScores(int[][] marks) {
        double[][] scores = new double[marks.length][3];

        for (int i = 0; i < marks.length; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            scores[i][0] = total;
            scores[i][1] = Math.round(average * 100.0) / 100.0;
            scores[i][2] = Math.round(percentage * 100.0) / 100.0;
        }

        return scores;
    }

    // Method to display the scorecard in tabular format
    public static void displayScorecard(int[][] marks, double[][] scores) {
        System.out.println("\nStudent Scorecard");
        System.out.println("--------------------------------------------------------------");
        System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s %-10s\n",
                "Student", "Physics", "Chemistry", "Math", "Total", "Average", "Percentage");
        System.out.println("--------------------------------------------------------------");

        for (int i = 0; i < marks.length; i++) {
            System.out.printf("%-10d %-10d %-10d %-10d %-10.2f %-10.2f %-10.2f\n",
                    (i + 1), marks[i][0], marks[i][1], marks[i][2],
                    scores[i][0], scores[i][1], scores[i][2]);
        }
        System.out.println("--------------------------------------------------------------");
    }
}

