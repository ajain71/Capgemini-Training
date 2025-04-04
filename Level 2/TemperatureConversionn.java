import java.util.Scanner;

public class TemperatureConversionn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Taking user input for Fahrenheit temperature
        System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();
        
        // Converting Fahrenheit to Celsius
        double celsiusResult = (fahrenheit - 32) * 5 / 9;
        
        // Displaying the result
        System.out.printf("The %.2f Fahrenheit is %.2f Celsius.%n", fahrenheit, celsiusResult);
        
        scanner.close();
    }
}

