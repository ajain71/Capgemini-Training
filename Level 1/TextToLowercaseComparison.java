
import java.util.Scanner;

public class TextToLowercaseComparison {
    
   
    public static String convertToLowercase(String text) {
        StringBuilder lowercaseText = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'A' && ch <= 'Z') {
                lowercaseText.append((char) (ch + 32)); // Convert to lowercase
            } else {
                lowercaseText.append(ch);
            }
        }
        return lowercaseText.toString();
    }
    
   
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
            return false;
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        
        
        String builtInLowercase = input.toLowerCase();
        
        
        String customLowercase = convertToLowercase(input);
        
       
        boolean areEqual = compareStrings(builtInLowercase, customLowercase);
        
        System.out.println("Custom Lowercase: " + customLowercase);
        System.out.println("Built-in Lowercase: " + builtInLowercase);
        System.out.println("Are both conversions equal? " + areEqual);
        
        scanner.close();
    }
}

