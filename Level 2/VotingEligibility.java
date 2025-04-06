
import java.util.Random;
import java.util.Scanner;

public class VotingEligibility {
    
   
    public static int[] generateAges(int n) {
        Random rand = new Random();
        int[] ages = new int[n];
        for (int i = 0; i < n; i++) {
            ages[i] = rand.nextInt(90) - 10;
        }
        return ages;
    }
    
   
    public static String[][] checkVotingEligibility(int[] ages) {
        String[][] results = new String[ages.length][2];
        
        for (int i = 0; i < ages.length; i++) {
            results[i][0] = String.valueOf(ages[i]);
            
            if (ages[i] < 0) {
                results[i][1] = "Invalid Age";
            } else if (ages[i] >= 18) {
                results[i][1] = "Can Vote";
            } else {
                results[i][1] = "Cannot Vote";
            }
        }
        
        return results;
    }
    
   
    public static void displayResults(String[][] results) {
        System.out.println("Age\tVoting Eligibility");
        System.out.println("----------------------");
        for (String[] row : results) {
            System.out.println(row[0] + "\t" + row[1]);
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();
        
        int[] ages = generateAges(n);
        String[][] results = checkVotingEligibility(ages);
        
        displayResults(results);
        scanner.close();
    }
}

