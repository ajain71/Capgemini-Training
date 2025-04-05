
import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Getting user input
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        
        // Define an array to store multiplication results
        int[] multiplicationTable = new int[10];
        
        // Compute multiplication results
        for (int i = 0; i < 10; i++) {
            multiplicationTable[i] = number * (i + 1);
        }
        
        // Display multiplication table
        for (int i = 0; i < 10; i++) {
            System.out.println(number + " * " + (i + 1) + " = " + multiplicationTable[i]);
        }
        
        scanner.close();
    }
}

