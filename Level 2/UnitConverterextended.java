
double liters2gallons = 0.264172; 
import java.util.Scanner;

public class UnitConverterextended {

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
    private static final double FAHRENHEIT_TO_CELSIUS = 5.0 / 9.0;
    private static final double CELSIUS_TO_FAHRENHEIT = 9.0 / 5.0;
    private static final double POUNDS_TO_KILOGRAMS = 0.453592;
    private static final double KILOGRAMS_TO_POUNDS = 2.20462;
    private static final double GALLONS_TO_LITERS = 3.78541;
    private static final double LITERS_TO_GALLONS = 0.264172;

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

    // Method to convert Fahrenheit to Celsius
    public static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * FAHRENHEIT_TO_CELSIUS;
    }

    // Method to convert Celsius to Fahrenheit
    public static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * CELSIUS_TO_FAHRENHEIT) + 32;
    }

    // Method to convert pounds to kilograms
    public static double convertPoundsToKilograms(double pounds) {
        return pounds * POUNDS_TO_KILOGRAMS;
    }

    // Method to convert kilograms to pounds
    public static double convertKilogramsToPounds(double kilograms) {
        return kilograms * KILOGRAMS_TO_POUNDS;
    }

    // Method to convert gallons to liters
    public static double convertGallonsToLiters(double gallons) {
        return gallons * GALLONS_TO_LITERS;
    }

    // Method to convert liters to gallons
    public static double convertLitersToGallons(double liters) {
        return liters * LITERS_TO_GALLONS;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter value in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();
        System.out.println(fahrenheit + " Fahrenheit in Celsius: " + convertFahrenheitToCelsius(fahrenheit));
        
        System.out.print("Enter value in Celsius: ");
        double celsius = scanner.nextDouble();
        System.out.println(celsius + " Celsius in Fahrenheit: " + convertCelsiusToFahrenheit(celsius));
        
        System.out.print("Enter value in pounds: ");
        double pounds = scanner.nextDouble();
        System.out.println(pounds + " pounds in kilograms: " + convertPoundsToKilograms(pounds));
        
        System.out.print("Enter value in kilograms: ");
        double kilograms = scanner.nextDouble();
        System.out.println(kilograms + " kilograms in pounds: " + convertKilogramsToPounds(kilograms));
        
        System.out.print("Enter value in gallons: ");
        double gallons = scanner.nextDouble();
        System.out.println(gallons + " gallons in liters: " + convertGallonsToLiters(gallons));
        
        System.out.print("Enter value in liters: ");
        double liters = scanner.nextDouble();
        System.out.println(liters + " liters in gallons: " + convertLitersToGallons(liters));
        
        scanner.close();
    }
}

