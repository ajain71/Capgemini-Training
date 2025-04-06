import java.util.Scanner;

public class FirstNonRepeatingCharacter {

    public static char findFirstNonRepeatingCharacter(String text) {
        int[] frequency = new int[256];
        int length = text.length();

        for (int i = 0; i < length; i++) {
            frequency[text.charAt(i)]++;
        }

        for (int i = 0; i < length; i++) {
            if (frequency[text.charAt(i)] == 1) {
                return text.charAt(i);
            }
        }

        return '\0';
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        char result = findFirstNonRepeatingCharacter(text);
        if (result != '\0') {
            System.out.println("First non-repeating character: " + result);
        } else {
            System.out.println("No non-repeating character found.");
        }

        scanner.close();
    }
}

