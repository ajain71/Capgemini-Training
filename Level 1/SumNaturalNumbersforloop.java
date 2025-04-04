
import java.util.Scanner;

public class SumNaturalNumbersforloop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a natural number: ");
        if (scanner.hasNextInt()) {
            int n = scanner.nextInt();
            
            if (n >= 1) {
                int sumFormula = n * (n + 1) / 2;
                int sumForLoop = 0;
                
                for (int i = 1; i <= n; i++) {
                    sumForLoop += i;
                }
                
                System.out.println("Sum using formula: " + sumFormula);
                System.out.println("Sum using for loop: " + sumForLoop);
                
                if (sumFormula == sumForLoop) {
                    System.out.println("Both computations match. The result is correct!");
                } else {
                    System.out.println("There is a mismatch in computations. Check the logic.");
                }
            } else {
                System.out.println("The number " + n + " is not a natural number.");
            }
        } else {
            System.out.println("Invalid input! Please enter a valid integer.");
        }
        
        scanner.close();
    }
}

