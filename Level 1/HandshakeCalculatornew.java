
import java.util.Scanner;

public class HandshakeCalculatornew {
    
    // Method to calculate maximum handshakes
    public static int calculateHandshakes(int n) {
        return (n * (n - 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking user input
        System.out.print("Enter number of students: ");
        int students = scanner.nextInt();
        
        // Calculating maximum handshakes
        int handshakes = calculateHandshakes(students);
        
        // Displaying result
        System.out.printf("The maximum number of handshakes among %d students is %d.%n", students, handshakes);
        
        scanner.close();
    }
}

