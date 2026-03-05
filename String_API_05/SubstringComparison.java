package String_API_05;
import java.util.Scanner;

public class SubstringComparison {

    // Method to create substring using charAt()
    public static String createSubstring(String str, int start, int end) {
        String result = "";

        for (int i = start; i < end; i++) {
            result = result + str.charAt(i);
        }

        return result;
    }

    // Method to compare two strings using charAt()
    public static boolean compareStrings(String s1, String s2) {

        if (s1.length() != s2.length()) {
            return false;
        }

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // input string
        System.out.print("Enter the string: ");
        String text = sc.next();

        // start index
        System.out.print("Enter start index: ");
        int start = sc.nextInt();

        // end index
        System.out.print("Enter end index: ");
        int end = sc.nextInt();

        // substring using charAt
        String substring1 = createSubstring(text, start, end);

        // substring using built-in method
        String substring2 = text.substring(start, end);

        // compare both substrings
        boolean result = compareStrings(substring1, substring2);

        // output
        System.out.println("Substring using charAt(): " + substring1);
        System.out.println("Substring using substring(): " + substring2);
        System.out.println("Are both substrings equal? " + result);

        sc.close();
    }
}