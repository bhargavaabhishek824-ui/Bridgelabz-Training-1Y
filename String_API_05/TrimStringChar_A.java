package String_API_05;
import java.util.Scanner;

public class TrimStringChar_A {

    // Method to find start and end indexes of non-space characters
    public static int[] trimIndexes(String text) {
        int start = 0;
        int end = text.length() - 1;

        // Trim leading spaces
        while (start <= end && text.charAt(start) == ' ') start++;

        // Trim trailing spaces
        while (end >= start && text.charAt(end) == ' ') end--;

        return new int[]{start, end};
    }

    // Method to create substring using charAt()
    public static String substringCharAt(String text, int start, int end) {
        String result = "";
        for (int i = start; i <= end; i++) {
            result += text.charAt(i);
        }
        return result;
    }

    // Method to compare two strings using charAt()
    public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) return false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string with spaces: ");
        String text = sc.nextLine();

        // User-defined trim using charAt()
        int[] indexes = trimIndexes(text);
        String trimmedUser = substringCharAt(text, indexes[0], indexes[1]);

        // Built-in trim method
        String trimmedBuiltIn = text.trim();

        // Compare the two results
        boolean isEqual = compareStrings(trimmedUser, trimmedBuiltIn);

        System.out.println("\nTrimmed string using charAt(): \"" + trimmedUser + "\"");
        System.out.println("Trimmed string using built-in trim(): \"" + trimmedBuiltIn + "\"");
        System.out.println("Are both results equal? " + isEqual);

        sc.close();
    }
}