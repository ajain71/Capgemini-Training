
import java.util.Scanner;

public class TriangularParkRun {
    
    // Method to compute the number of rounds required to complete 5 km
    public static int calculateRounds(double side1, double side2, double side3) {
        double perimeter = side1 + side2 + side3;
        return (int) Math.ceil(5000 / perimeter); // Converting 5 km to meters and rounding up
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking user input for the sides of the triangular park
        System.out.print("Enter the first side of the triangle (in meters): ");
        double side1 = scanner.nextDouble();
        
        System.out.print("Enter the second side of the triangle (in meters): ");
        double side2 = scanner.nextDouble();
        
        System.out.print("Enter the third side of the triangle (in meters): ");
        double side3 = scanner.nextDouble();
        
        // Calculating the number of rounds
        int rounds = calculateRounds(side1, side2, side3);
        
        // Displaying the result
        System.out.printf("The athlete needs to complete %d rounds to cover 5 km.%n", rounds);
        
        scanner.close();
    }
}

