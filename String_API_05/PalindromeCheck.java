package String_API_05;
import java.util.Scanner;

public class PalindromeCheck {

    // Logic 1: Iterative start-end comparison
    public static boolean isPalindromeIterative(String text) {
        int start = 0;
        int end = text.length() - 1;

        while (start < end) {
            if (text.charAt(start) != text.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    // Logic 2: Recursive start-end comparison
    public static boolean isPalindromeRecursive(String text, int start, int end) {
        if (start >= end) {
            return true;
        }
        if (text.charAt(start) != text.charAt(end)) {
            return false;
        }
        return isPalindromeRecursive(text, start + 1, end - 1);
    }

    // Logic 3: Using char arrays and reversed array
    public static boolean isPalindromeUsingArray(String text) {
        int n = text.length();
        char[] original = text.toCharArray();
        char[] reversed = new char[n];

        // Create reversed array
        for (int i = 0; i < n; i++) {
            reversed[i] = text.charAt(n - i - 1);
        }

        // Compare original and reversed
        for (int i = 0; i < n; i++) {
            if (original[i] != reversed[i]) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a text to check palindrome: ");
        String text = sc.nextLine();

        // Logic 1
        boolean result1 = isPalindromeIterative(text);
        System.out.println("Palindrome check (Iterative start-end): " + result1);

        // Logic 2
        boolean result2 = isPalindromeRecursive(text, 0, text.length() - 1);
        System.out.println("Palindrome check (Recursive): " + result2);

        // Logic 3
        boolean result3 = isPalindromeUsingArray(text);
        System.out.println("Palindrome check (Using char arrays): " + result3);

        sc.close();
    }
}