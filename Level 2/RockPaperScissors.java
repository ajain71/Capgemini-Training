
import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    
    public static String getComputerChoice() {
        String[] choices = {"Rock", "Paper", "Scissors"};
        return choices[new Random().nextInt(3)];
    }
    
   
    public static String determineWinner(String userChoice, String computerChoice) {
        if (userChoice.equalsIgnoreCase(computerChoice)) {
            return "Draw";
        } else if ((userChoice.equalsIgnoreCase("Rock") && computerChoice.equals("Scissors")) ||
                   (userChoice.equalsIgnoreCase("Scissors") && computerChoice.equals("Paper")) ||
                   (userChoice.equalsIgnoreCase("Paper") && computerChoice.equals("Rock"))) {
            return "User";
        } else {
            return "Computer";
        }
    }
    
   
    public static String[][] calculateStats(int userWins, int computerWins, int totalGames) {
        String[][] stats = new String[3][2];
        stats[0][0] = "User Wins";
        stats[0][1] = String.valueOf(userWins);
        stats[1][0] = "Computer Wins";
        stats[1][1] = String.valueOf(computerWins);
        stats[2][0] = "User Win %";
        stats[2][1] = String.format("%.2f%%", (userWins * 100.0) / totalGames);
        return stats;
    }
    
   
    public static void displayResults(String[][] gameResults, String[][] stats) {
        System.out.println("Game Results:");
        System.out.println("User Choice\tComputer Choice\tWinner");
        System.out.println("--------------------------------------");
        for (String[] result : gameResults) {
            System.out.println(result[0] + "\t\t" + result[1] + "\t\t" + result[2]);
        }
        System.out.println("\nStatistics:");
        for (String[] stat : stats) {
            System.out.println(stat[0] + ": " + stat[1]);
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of games: ");
        int totalGames = scanner.nextInt();
        
        String[][] gameResults = new String[totalGames][3];
        int userWins = 0, computerWins = 0;
        
        for (int i = 0; i < totalGames; i++) {
            System.out.print("Enter your choice (Rock/Paper/Scissors): ");
            String userChoice = scanner.next();
            String computerChoice = getComputerChoice();
            String winner = determineWinner(userChoice, computerChoice);
            
            gameResults[i][0] = userChoice;
            gameResults[i][1] = computerChoice;
            gameResults[i][2] = winner;
            
            if (winner.equals("User")) userWins++;
            else if (winner.equals("Computer")) computerWins++;
        }
        
        String[][] stats = calculateStats(userWins, computerWins, totalGames);
        displayResults(gameResults, stats);
        
        scanner.close();
    }
}

