
import java.util.Scanner;

public class LeapYearChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a year (>= 1582): ");
        int year = scanner.nextInt();
        
        if (year >= 1582) {
            // Using multiple if-else statements
            if (year % 400 == 0) {
                System.out.println(year + " is a Leap Year.");
            } else if (year % 100 == 0) {
                System.out.println(year + " is not a Leap Year.");
            } else if (year % 4 == 0) {
                System.out.println(year + " is a Leap Year.");
            } else {
                System.out.println(year + " is not a Leap Year.");
            }
            
            // Using a single if statement with logical operators
            boolean isLeapYear = (year % 400 == 0) || (year % 4 == 0 && year % 100 != 0);
            System.out.println("(Logical check) " + year + (isLeapYear ? " is a Leap Year." : " is not a Leap Year."));
        } else {
            System.out.println("Please enter a year greater than or equal to 1582.");
        }
        
        scanner.close();
    }
}

