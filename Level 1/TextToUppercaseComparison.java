import java.util.Scanner;

public class TextToUppercaseComparison {
    
       public static String convertToUppercase(String text) {
        StringBuilder uppercaseText = new StringBuilder();
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (ch >= 'a' && ch <= 'z') {
                uppercaseText.append((char) (ch - 32));            
 } else {
                uppercaseText.append(ch);
            }
        }
        return uppercaseText.toString();
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
        
       
        String builtInUppercase = input.toUpperCase();
        
                String customUppercase = convertToUppercase(input);
        
       
        boolean areEqual = compareStrings(builtInUppercase, customUppercase);
        
                System.out.println("Custom Uppercase: " + customUppercase);
        System.out.println("Built-in Uppercase: " + builtInUppercase);
        System.out.println("Are both conversions equal? " + areEqual);
        
        scanner.close();
    }
}