import java.util.Scanner;

public class MaxOfThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        System.out.print("Enter third number: ");
        int num3 = scanner.nextInt();
        scanner.close();
        
        int maxNumber = findMax(num1, num2, num3);
        System.out.println("The maximum number is: " + maxNumber);
    }
    
    public static int findMax(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }
}

