import java.util.Scanner;

public class TravelDetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your departure city: ");
        String fromCity = scanner.nextLine();

        System.out.print("Enter the via city: ");
        String viaCity = scanner.nextLine();

        System.out.print("Enter your destination city: ");
        String toCity = scanner.nextLine();

        System.out.print("Enter the distance from " + fromCity + " to " + viaCity + " in miles: ");
        double fromToVia = scanner.nextDouble();

        System.out.print("Enter the distance from " + viaCity + " to " + toCity + " in miles: ");
        double viaToFinalCity = scanner.nextDouble();

        System.out.print("Enter the total time taken in hours: ");
        double timeTaken = scanner.nextDouble();

        double totalDistance = fromToVia + viaToFinalCity;
        double averageSpeed = totalDistance / timeTaken;

        System.out.println("Hello " + name + ", your journey details:");
        System.out.println("From: " + fromCity + " Via: " + viaCity + " To: " + toCity);
        System.out.println("Total Distance: " + totalDistance + " miles");
        System.out.println("Total Time Taken: " + timeTaken + " hours");
        System.out.println("Average Speed: " + averageSpeed + " miles per hour");

        scanner.close();
    }
}

