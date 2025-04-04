import java.util.Scanner;

public class TriangleAreaCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the base of the triangle (cm): ");
        double base = scanner.nextDouble();

        System.out.print("Enter the height of the triangle (cm): ");
        double height = scanner.nextDouble();

        double areaCm = 0.5 * base * height;
        double areaInches = areaCm / 6.4516;

        System.out.println("The area of the triangle is " + areaCm + " square cm and " + areaInches + " square inches.");

        scanner.close();
    }
}

