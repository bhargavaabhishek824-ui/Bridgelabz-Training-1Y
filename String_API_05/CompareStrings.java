package String_API_05;
import java.util.Scanner;

public class CompareStrings {

    // Method to compare two strings using charAt()
    public static boolean compareUsingCharAt(String s1, String s2) {

        // Agar length different hai to equal nahi ho sakti
        if (s1.length() != s2.length()) {
            return false;
        }

        // Har character compare karenge
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // user input
        System.out.print("Enter first string: ");
        String str1 = sc.next();

        System.out.print("Enter second string: ");
        String str2 = sc.next();

        // charAt() method result
        boolean result1 = compareUsingCharAt(str1, str2);

        // built-in equals() result
        boolean result2 = str1.equals(str2);

        // results print
        System.out.println("Result using charAt(): " + result1);
        System.out.println("Result using equals(): " + result2);

        // compare both results
        if (result1 == result2) {
            System.out.println("Both methods give the same result.");
        } else {
            System.out.println("Results are different.");
        }

        sc.close();
    }
}