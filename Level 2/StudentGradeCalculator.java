
import java.util.Scanner;

public class StudentGradeCalculator {
    
   
    public static int[][] inputMarks(int students) {
        Scanner scanner = new Scanner(System.in);
        int[][] marks = new int[students][3];
        
        for (int i = 0; i < students; i++) {
            System.out.println("Enter marks for Student " + (i + 1) + ":");
            System.out.print("Physics: ");
            marks[i][0] = scanner.nextInt();
            System.out.print("Chemistry: ");
            marks[i][1] = scanner.nextInt();
            System.out.print("Maths: ");
            marks[i][2] = scanner.nextInt();
        }
        scanner.close();
        return marks;
    }
    
    
    public static double[][] calculateScores(int[][] marks) {
        double[][] results = new double[marks.length][3];
        
        for (int i = 0; i < marks.length; i++) {
            int total = marks[i][0] + marks[i][1] + marks[i][2];
            double average = Math.round((total / 3.0) * 100.0) / 100.0;
            double percentage = Math.round((total / 3.0) * 100.0) / 100.0;
            
            results[i][0] = total;
            results[i][1] = average;
            results[i][2] = percentage;
        }
        return results;
    }
    
    
    public static String[] determineGrades(double[][] scores) {
        String[] grades = new String[scores.length];
        
        for (int i = 0; i < scores.length; i++) {
            double percentage = scores[i][2];
            if (percentage >= 80) grades[i] = "A (Above agency-normalized standards)";
            else if (percentage >= 70) grades[i] = "B (At agency-normalized standards)";
            else if (percentage >= 60) grades[i] = "C (Below, but approaching agency-normalized standards)";
            else if (percentage >= 50) grades[i] = "D (Well below agency-normalized standards)";
            else if (percentage >= 40) grades[i] = "E (Too below agency-normalized standards)";
            else grades[i] = "R (Remedial standards)";
        }
        return grades;
    }
    
    
    public static void displayScorecard(int[][] marks, double[][] scores, String[] grades) {
        System.out.println("Student\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage\tGrade");
        System.out.println("------------------------------------------------------------------------------------");
        
        for (int i = 0; i < marks.length; i++) {
            System.out.println((i + 1) + "\t" + marks[i][0] + "\t" + marks[i][1] + "\t" + marks[i][2] + "\t" +
                               scores[i][0] + "\t" + scores[i][1] + "\t" + scores[i][2] + "%\t" + grades[i]);
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int students = scanner.nextInt();
        
        int[][] marks = inputMarks(students);
        double[][] scores = calculateScores(marks);
        String[] grades = determineGrades(scores);
        
        displayScorecard(marks, scores, grades);
        scanner.close();
    }
}

