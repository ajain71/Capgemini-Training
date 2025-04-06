
import java.util.Scanner;

public class StringSplitComparison2D {
    
   
    public static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (IndexOutOfBoundsException e) {
            return count;
        }
    }
    
    public static String[] customSplit(String text) {
        int length = findLength(text);
        int spaceCount = 0;
        
       
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
        
        words[wordIndex] = text.substring(wordStart);
        
        return words;
    }
    
   
    public static String[][] wordsWithLengths(String[] words) {
        String[][] result = new String[words.length][2];
        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(findLength(words[i]));
        }
        return result;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
       
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();
        
       
        String[] customWords = customSplit(input);
        
        String[][] wordsWithLengths = wordsWithLengths(customWords);
        
       
        System.out.println("Word\tLength");
        System.out.println("----------------");
        for (String[] wordPair : wordsWithLengths) {
            System.out.println(wordPair[0] + "\t" + Integer.parseInt(wordPair[1]));
        }
        
        scanner.close();
    }
}

