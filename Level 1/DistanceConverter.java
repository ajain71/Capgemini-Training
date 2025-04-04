import java.util.Scanner;

public class DistanceConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the distance in feet: ");
        double distanceInFeet = scanner.nextDouble();

        double distanceInYards = distanceInFeet / 3;
        double distanceInMiles = distanceInYards / 1760;

        System.out.println("The distance in feet is " + distanceInFeet + " which is " + distanceInYards + " yards and " + distanceInMiles + " miles.");

        scanner.close();
    }
}

