import java.util.Random;
import java.util.Scanner;
public class CardGame {
    private static final String[] SUITS = {"Hearts", "Diamonds", "Clubs", "Spades"};
    private static final String[] RANKS = {
        "2", "3", "4", "5", "6", "7", "8", "9", "10", 
        "Jack", "Queen", "King", "Ace"
    };
    private static String[] initializeDeck() {
        int numOfCards = SUITS.length * RANKS.length;
        String[] deck = new String[numOfCards];
        int index = 0;
        for (String suit : SUITS) {
            for (String rank : RANKS) {
                deck[index++] = rank + " of " + suit;
            }
        }
        return deck;
    }
    private static void shuffleDeck(String[] deck) {
        Random rand = new Random();
        int n = deck.length;
        for (int i = 0; i < n; i++) {
            int randomCardNumber = i + rand.nextInt(n - i);
            String temp = deck[i];
            deck[i] = deck[randomCardNumber];
            deck[randomCardNumber] = temp;
        }
    }
    private static String[][] distributeCards(String[] deck, int n, int x) {
        if (n * x > deck.length) {
            System.out.println("Not enough cards to distribute!");
            return null;
        }
        String[][] players = new String[x][n];
        int index = 0;
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < n; j++) {
                players[i][j] = deck[index++];
            }
        }
        return players;
    }
    private static void printPlayersCards(String[][] players) {
        if (players == null) return;
        for (int i = 0; i < players.length; i++) {
            System.out.println("Player " + (i + 1) + "'s cards:");
            for (String card : players[i]) {
                System.out.println("  " + card);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of players: ");
        int x = scanner.nextInt();
        System.out.print("Enter the number of cards per player: ");
        int n = scanner.nextInt();
        scanner.close();
        String[] deck = initializeDeck();
        shuffleDeck(deck);
        String[][] players = distributeCards(deck, n, x);
        printPlayersCards(players);
    }
}

