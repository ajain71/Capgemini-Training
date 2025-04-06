
import java.util.Scanner;

public class CharacterFrequencyneww {

    public static String[][] findCharacterFrequency(String text) {
        char[] characters = text.toCharArray();
        int length = characters.length;
        int[] frequency = new int[length];

        for (int i = 0; i < length; i++) {
            frequency[i] = 1;
            if (characters[i] != '0') {
                for (int j = i + 1; j < length; j++) {
                    if (characters[i] == characters[j]) {
                        frequency[i]++;
                        characters[j] = '0';
                    }
                }
            }
        }

        int uniqueCount = 0;
        for (int i = 0; i < length; i++) {
            if (characters[i] != '0') {
                uniqueCount++;
            }
        }

        String[][] result = new String[uniqueCount][2];
        int index = 0;
        for (int i = 0; i < length; i++) {
            if (characters[i] != '0') {
                result[index][0] = String.valueOf(characters[i]);
                result[index][1] = String.valueOf(frequency[i]);
                index++;
            }
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

