
import java.util.Scanner;

public class UnitConverter {

    // Conversion constants
    private static final double KM_TO_MILES = 0.621371;
    private static final double MILES_TO_KM = 1.60934;
    private static final double METERS_TO_FEET = 3.28084;
    private static final double FEET_TO_METERS = 0.3048;

    // Method to convert kilometers to miles
    public static double convertKmToMiles(double km) {
        return km * KM_TO_MILES;
    }

    // Method to convert miles to kilometers
    public static double convertMilesToKm(double miles) {
        return miles * MILES_TO_KM;
    }

    // Method to convert meters to feet
    public static double convertMetersToFeet(double meters) {
        return meters * METERS_TO_FEET;
    }

    // Method to convert feet to meters
    public static double convertFeetToMeters(double feet) {
        return feet * FEET_TO_METERS;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter value in kilometers: ");
        double km = scanner.nextDouble();
        System.out.println(km + " km in miles: " + convertKmToMiles(km));
        
        System.out.print("Enter value in miles: ");
        double miles = scanner.nextDouble();
        System.out.println(miles + " miles in km: " + convertMilesToKm(miles));
        
        System.out.print("Enter value in meters: ");
        double meters = scanner.nextDouble();
        System.out.println(meters + " meters in feet: " + convertMetersToFeet(meters));
        
        System.out.print("Enter value in feet: ");
        double feet = scanner.nextDouble();
        System.out.println(feet + " feet in meters: " + convertFeetToMeters(feet));
        
        scanner.close();
    }
}

