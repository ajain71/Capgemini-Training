
 import java.util.Scanner;
public class PalindromeCheck {
    // Logic 1: Compare characters from start and end
    public static boolean isPalindromeIterative(String text) {
        int start = 0, end = text.length() - 1;
        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    // Logic 2: Recursive method to check palindrome
    public static boolean isPalindromeRecursive(String text, int start, int end) {
        if (start >= end) return true; 
        if (text.charAt(start) != text.charAt(end)) return false;
        return isPalindromeRecursive(text, start + 1, end - 1);
    }
    // Logic 3: Using character arrays and reverse string
    public static boolean isPalindromeUsingArray(String text) {
        char[] original = text.toCharArray();
        char[] reverse = new char[original.length];
        for (int i = 0; i < original.length; i++) {
            reverse[i] = original[original.length - 1 - i];
        }
        return new String(original).equals(new String(reverse));
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine().toLowerCase().replaceAll("[^a-zA-Z0-9]", ""); 
        boolean result1 = isPalindromeIterative(input);
        boolean result2 = isPalindromeRecursive(input, 0, input.length() - 1);
        boolean result3 = isPalindromeUsingArray(input);
        System.out.println("Palindrome Check Results:");
        System.out.println("Using Iterative Approach: " + (result1 ? "Palindrome" : "Not a Palindrome"));
        System.out.println("Using Recursion: " + (result2 ? "Palindrome" : "Not a Palindrome"));
        System.out.println("Using Character Array: " + (result3 ? "Palindrome" : "Not a Palindrome"));
        scanner.close();
    }
}

