
import java.util.Scanner;

public class MultiplicationTableRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Getting user input
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        // Define an array to store multiplication results
        int[] multiplicationResult = new int[4];
        
        // Compute multiplication results for 6 to 9
        for (int i = 0; i < 4; i++) {
            multiplicationResult[i] = number * (i + 6);
        }
        
        // Display multiplication table from 6 to 9
        for (int i = 0; i < 4; i++) {
            System.out.println(number + " * " + (i + 6) + " = " + multiplicationResult[i]);
        }
        
        scanner.close();
    }
}

