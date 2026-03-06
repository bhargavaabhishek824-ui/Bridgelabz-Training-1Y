package Level_03;
import java.util.Arrays;

public class NumberChecke {

    // Count digits
    public static int countDigits(int number) {
        return String.valueOf(Math.abs(number)).length();
    }

    // Store digits in array
    public static int[] digitsArray(int number) {
        String str = String.valueOf(Math.abs(number));
        int[] digits = new int[str.length()];
        for (int i = 0; i < str.length(); i++) digits[i] = str.charAt(i) - '0';
        return digits;
    }

    // Reverse digits array
    public static int[] reverseArray(int[] arr) {
        int[] reversed = new int[arr.length];
        for (int i = 0; i < arr.length; i++) reversed[i] = arr[arr.length - 1 - i];
        return reversed;
    }

    // Compare two arrays
    public static boolean arraysEqual(int[] arr1, int[] arr2) {
        return Arrays.equals(arr1, arr2);
    }

    // Check palindrome
    public static boolean isPalindrome(int number) {
        int[] original = digitsArray(number);
        int[] reversed = reverseArray(original);
        return arraysEqual(original, reversed);
    }

    // Check duck number (contains at least one non-zero digit)
    public static boolean isDuckNumber(int number) {
        int[] digits = digitsArray(number);
        for (int d : digits) if (d != 0) return true;
        return false;
    }

    public static void main(String[] args) {
        int number = 12321;
        System.out.println("Number: " + number);
        System.out.println("Is Palindrome? " + isPalindrome(number));
        System.out.println("Is Duck Number? " + isDuckNumber(number));
    }
}