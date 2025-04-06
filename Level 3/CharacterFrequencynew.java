
import java.util.Scanner;

public class CharacterFrequencynew {

    public static char[] findUniqueCharacters(String text) {
        int length = text.length();
        char[] uniqueChars = new char[length];
        int uniqueCount = 0;

        for (int i = 0; i < length; i++) {
            char currentChar = text.charAt(i);
            boolean isUnique = true;

            for (int j = 0; j < uniqueCount; j++) {
                if (uniqueChars[j] == currentChar) {
                    isUnique = false;
                    break;
                }
            }

            if (isUnique) {
                uniqueChars[uniqueCount] = currentChar;
                uniqueCount++;
            }
        }

        char[] result = new char[uniqueCount];
        System.arraycopy(uniqueChars, 0, result, 0, uniqueCount);
        return result;
    }

    public static String[][] findCharacterFrequency(String text) {
        char[] uniqueChars = findUniqueCharacters(text);
        String[][] result = new String[uniqueChars.length][2];

        for (int i = 0; i < uniqueChars.length; i++) {
            char currentChar = uniqueChars[i];
            int count = 0;
            for (int j = 0; j < text.length(); j++) {
                if (text.charAt(j) == currentChar) {
                    count++;
                }
            }
            result[i][0] = String.valueOf(currentChar);
            result[i][1] = String.valueOf(count);
        }
        return result;
    }

    public static void displayCharacterFrequency(String[][] frequencyData) {
        System.out.println("Character | Frequency");
        System.out.println("---------------------");
        for (String[] data : frequencyData) {
            System.out.println("    " + data[0] + "      |      " + data[1]);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();

        String[][] frequencyData = findCharacterFrequency(text);
        displayCharacterFrequency(frequencyData);

        scanner.close();
    }
}

