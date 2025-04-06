import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter temperature: ");
        double temperature = scanner.nextDouble();
        
        System.out.print("Convert to (C/F): ");
        char unit = scanner.next().charAt(0);
        scanner.close();
        
        if (unit == 'C' || unit == 'c') {
            System.out.println("Temperature in Celsius: " + fahrenheitToCelsius(temperature));
        } else if (unit == 'F' || unit == 'f') {
            System.out.println("Temperature in Fahrenheit: " + celsiusToFahrenheit(temperature));
        } else {
            System.out.println("Invalid unit. Please enter 'C' or 'F'.");
        }
    }
    
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
    
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
}

