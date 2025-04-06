
import java.util.Scanner;

public class StringSplitComparison1 {

    // Method to find the length of a string without using length()
    public static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count); // Access characters until an exception occurs
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
            return count; // Return the count when exception occurs
        }
    }

    // Method to split a string into words without using split()
    public static String[] customSplit(String text) {
        int length = findLength(text);
        int spaceCount = 0;

        // Count spaces to determine the number of words
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                spaceCount++;
            }
        }

        String[] words = new String[spaceCount + 1];
        int wordStart = 0;
        int wordIndex = 0;

        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                words[wordIndex++] = text.substring(wordStart, i);
                wordStart = i + 1;
            }
        }

        // Capture the last word
        words[wordIndex] = text.substring(wordStart);

        return words;
    }

    // Method to return a 2D array of words and their lengths
    public static String[][] wordsWithLengths(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(findLength(words[i]));
        }
        return result;
    }

    // Method to find the shortest and longest words
    public static String[] findShortestAndLongest(String[][] wordsWithLengths) {
        String shortest = wordsWithLengths[0][0];
        String longest = wordsWithLengths[0][0];

        for (String[] wordPair : wordsWithLengths) {
            if (findLength(wordPair[0]) < findLength(shortest)) {
                shortest = wordPair[0];
            }
            if (findLength(wordPair[0]) > findLength(longest)) {
                longest = wordPair[0];
            }
        }

        return new String[]{shortest, longest};
    }

    // Method to count vowels and consonants
    public static int[] countVowelsAndConsonants(String text) {
        int vowels = 0, consonants = 0;
        String vowelsList = "aeiou";

        for (int i = 0; i < findLength(text); i++) {
            char ch = text.charAt(i);
            if (Character.isLetter(ch)) {
                char lowerCh = Character.toLowerCase(ch);
                if (vowelsList.indexOf(lowerCh) != -1) {
                    vowels++;
                } else {
                    consonants++;
                }
            }
        }
        return new int[]{vowels, consonants};
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking input from user
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();

        // Split using custom method
        String[] customWords = customSplit(input);

        // Get words with lengths
        String[][] wordsWithLengths = wordsWithLengths(customWords);

        // Find shortest and longest words
        String[] shortestAndLongest = findShortestAndLongest(wordsWithLengths);

        // Count vowels and consonants
        int[] vowelConsonantCount = countVowelsAndConsonants(input);

        // Display results in tabular format
        System.out.println("Word\tLength");
        System.out.println("----------------");
        for (String[] wordPair : wordsWithLengths) {
            System.out.println(wordPair[0] + "\t" + Integer.parseInt(wordPair[1]));
        }

        // Display shortest and longest words
        System.out.println("\nShortest Word: " + shortestAndLongest[0]);
        System.out.println("Longest Word: " + shortestAndLongest[1]);

        // Display vowel and consonant counts
        System.out.println("\nTotal Vowels: " + vowelConsonantCount[0]);
        System.out.println("Total Consonants: " + vowelConsonantCount[1]);

        scanner.close();
    }
}

