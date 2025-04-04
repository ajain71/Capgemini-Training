
import java.util.Scanner;

public class OddEvenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a natural number: ");
        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            
            if (number >= 1) {
                for (int i = 1; i <= number; i++) {
                    if (i % 2 == 0) {
                        System.out.println(i + " is an even number.");
                    } else {
                        System.out.println(i + " is an odd number.");
                    }
                }
            } else {
                System.out.println("The number " + number + " is not a natural number.");
            }
        } else {
            System.out.println("Invalid input! Please enter a valid integer.");
        }
        
        scanner.close();
    }
}

