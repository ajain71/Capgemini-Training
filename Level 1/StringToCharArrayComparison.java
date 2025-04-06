
import java.util.Scanner;
import java.util.Arrays;

public class StringToCharArrayComparison {
    
    // Method to return characters of a string without using toCharArray()
    public static char[] getCharacters(String str) {
        char[] charArray = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            charArray[i] = str.charAt(i);
        }
        return charArray;
    }
    
    // Method to compare two character arrays
    public static boolean compareCharArrays(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
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
        
        // Getting characters using custom method
        char[] customCharArray = getCharacters(str);
        
        // Getting characters using built-in toCharArray() method
        char[] builtInCharArray = str.toCharArray();
        
        // Comparing the two character arrays
        boolean comparisonResult = compareCharArrays(customCharArray, builtInCharArray);
        
        // Displaying results
        System.out.println("Custom char array: " + Arrays.toString(customCharArray));
        System.out.println("Built-in char array: " + Arrays.toString(builtInCharArray));
        System.out.println("Comparison result: " + comparisonResult);
        
        scanner.close();
    }
}

