import java.util.Scanner;

public class SumNaturalNumbers {
    
    // Method to calculate the sum of n natural numbers using a loop
    public static int sumOfNaturalNumbers(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking user input
        System.out.print("Enter a positive integer: ");
        int n = scanner.nextInt();
        
        if (n > 0) {
            // Calculating sum of n natural numbers
            int sum = sumOfNaturalNumbers(n);
            
            // Displaying the result
            System.out.printf("The sum of first %d natural numbers is %d.%n", n, sum);
        } else {
            System.out.println("Please enter a positive integer.");
        }
        
        scanner.close();
    }
}

