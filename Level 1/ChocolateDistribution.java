import java.util.Scanner;

public class ChocolateDistribution {
    
    // Method to find the number of chocolates each child gets and the remaining chocolates
    public static int[] findRemainderAndQuotient(int numberOfChocolates, int numberOfChildren) {
        if (numberOfChildren == 0) {
            throw new ArithmeticException("Number of children cannot be zero.");
        }
        int chocolatesPerChild = numberOfChocolates / numberOfChildren;
        int remainingChocolates = numberOfChocolates % numberOfChildren;
        return new int[]{chocolatesPerChild, remainingChocolates};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking user input
        System.out.print("Enter the number of chocolates: ");
        int numberOfChocolates = scanner.nextInt();
        
        System.out.print("Enter the number of children: ");
        int numberOfChildren = scanner.nextInt();
        
        try {
            // Calculating distribution
            int[] result = findRemainderAndQuotient(numberOfChocolates, numberOfChildren);
            
            // Displaying the result
            System.out.printf("Each child gets %d chocolates and %d chocolates remain.%n", result[0], result[1]);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        
        scanner.close();
    }
}

