import java.util.Scanner;

public class NaturalNumberSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            
            if (number >= 1) {
                int sum = number * (number + 1) / 2;
                System.out.println("The sum of " + number + " natural numbers is " + sum);
            } else {
                System.out.println("The number " + number + " is not a natural number.");
            }
        } else {
            System.out.println("Invalid input! Please enter a valid integer.");
        }
        
        scanner.close();
    }
}



