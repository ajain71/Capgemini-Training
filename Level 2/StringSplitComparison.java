
import java.util.Scanner;

public class StringSplitComparison {
    
   
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
            if (text.charAt(i) == ' ' || i == length - 1) {
                words[wordIndex] = text.substring(wordStart, (i == length - 1) ? i + 1 : i);
                wordStart = i + 1;
                wordIndex++;
            }
        }
        return words;
    }
    
   
    public static boolean compareArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
       
        System.out.print("Enter a sentence: ");
        String input = scanner.nextLine();
        
       
        String[] customWords = customSplit(input);
        
       
        String[] builtInWords = input.split(" ");
        
       
        boolean areEqual = compareArrays(customWords, builtInWords);
        
       
        System.out.println("Custom Split: " + String.join(", ", customWords));
        System.out.println("Built-in Split: " + String.join(", ", builtInWords));
        System.out.println("Are both splits equal? " + areEqual);
        
        scanner.close();
    }
}

