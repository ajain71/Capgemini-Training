
double inches2cm = 2.54;
import java.util.Scanner;

public class UnitConverterext {

    // Conversion constants
    private static final double KM_TO_MILES = 0.621371;
    private static final double MILES_TO_KM = 1.60934;
    private static final double METERS_TO_FEET = 3.28084;
    private static final double FEET_TO_METERS = 0.3048;
    private static final double YARDS_TO_FEET = 3;
    private static final double FEET_TO_YARDS = 0.333333;
    private static final double METERS_TO_INCHES = 39.3701;
    private static final double INCHES_TO_METERS = 0.0254;
    private static final double INCHES_TO_CM = 2.54;

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

    // Method to convert yards to feet
    public static double convertYardsToFeet(double yards) {
        return yards * YARDS_TO_FEET;
    }

    // Method to convert feet to yards
    public static double convertFeetToYards(double feet) {
        return feet * FEET_TO_YARDS;
    }

    // Method to convert meters to inches
    public static double convertMetersToInches(double meters) {
        return meters * METERS_TO_INCHES;
    }

    // Method to convert inches to meters
    public static double convertInchesToMeters(double inches) {
        return inches * INCHES_TO_METERS;
    }

    // Method to convert inches to centimeters
    public static double convertInchesToCm(double inches) {
        return inches * INCHES_TO_CM;
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
        
        System.out.print("Enter value in yards: ");
        double yards = scanner.nextDouble();
        System.out.println(yards + " yards in feet: " + convertYardsToFeet(yards));
        
        System.out.print("Enter value in feet: ");
        feet = scanner.nextDouble();
        System.out.println(feet + " feet in yards: " + convertFeetToYards(feet));
        
        System.out.print("Enter value in meters: ");
        meters = scanner.nextDouble();
        System.out.println(meters + " meters in inches: " + convertMetersToInches(meters));
        
        System.out.print("Enter value in inches: ");
        double inches = scanner.nextDouble();
        System.out.println(inches + " inches in meters: " + convertInchesToMeters(inches));
        
        System.out.print("Enter value in inches: ");
        inches = scanner.nextDouble();
        System.out.println(inches + " inches in cm: " + convertInchesToCm(inches));
        
        scanner.close();
    }
}

