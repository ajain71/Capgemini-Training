
import java.util.Scanner;

public class SubstringComparison {
    
    // Method to create a substring using charAt()
    public static String customSubstring(String str, int start, int end) {
        StringBuilder subStr = new StringBuilder();
        for (int i = start; i < end; i++) {
            subStr.append(str.charAt(i));
        }
        return subStr.toString();
    }
    
    // Method to compare two strings using charAt()
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
        
        // Taking input from user
        System.out.print("Enter the string: ");
        String str = scanner.next();
        
        System.out.print("Enter start index: ");
        int start = scanner.nextInt();
        
        System.out.print("Enter end index: ");
        int end = scanner.nextInt();
        
        // Creating substring using custom method
        String customSub = customSubstring(str, start, end);
        
        // Creating substring using built-in method
        String builtInSub = str.substring(start, end);
        
        // Comparing the two substrings
        boolean comparisonResult = compareStrings(customSub, builtInSub);
        
        // Displaying results
        System.out.println("Custom Substring: " + customSub);
        System.out.println("Built-in Substring: " + builtInSub);
        System.out.println("Comparison result: " + comparisonResult);
        
        scanner.close();
    }
}

