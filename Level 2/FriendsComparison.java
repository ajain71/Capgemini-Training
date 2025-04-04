
import java.util.Scanner;

public class FriendsComparison {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter Amar's age: ");
        int amarAge = scanner.nextInt();
        System.out.print("Enter Amar's height in cm: ");
        int amarHeight = scanner.nextInt();
        
        System.out.print("Enter Akbar's age: ");
        int akbarAge = scanner.nextInt();
        System.out.print("Enter Akbar's height in cm: ");
        int akbarHeight = scanner.nextInt();
        
        System.out.print("Enter Anthony's age: ");
        int anthonyAge = scanner.nextInt();
        System.out.print("Enter Anthony's height in cm: ");
        int anthonyHeight = scanner.nextInt();
        
        // Finding the youngest friend
        int youngestAge = Math.min(amarAge, Math.min(akbarAge, anthonyAge));
        String youngestFriend = (youngestAge == amarAge) ? "Amar" : (youngestAge == akbarAge) ? "Akbar" : "Anthony";
        System.out.println("The youngest friend is " + youngestFriend + " with age " + youngestAge + ".");
        
        // Finding the tallest friend
        int tallestHeight = Math.max(amarHeight, Math.max(akbarHeight, anthonyHeight));
        String tallestFriend = (tallestHeight == amarHeight) ? "Amar" : (tallestHeight == akbarHeight) ? "Akbar" : "Anthony";
        System.out.println("The tallest friend is " + tallestFriend + " with height " + tallestHeight + " cm.");
        
        scanner.close();
    }
}

