import java.util.Scanner;

public class FibonacciSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of terms: ");
        int terms = scanner.nextInt();
        scanner.close();
        
        System.out.println("Fibonacci Sequence:");
        printFibonacci(terms);
    }
    
    public static void printFibonacci(int terms) {
        int first = 0, second = 1;
        for (int i = 0; i < terms; i++) {
            System.out.print(first + " ");
            int next = first + second;
            first = second;
            second = next;
        }
    }
}

