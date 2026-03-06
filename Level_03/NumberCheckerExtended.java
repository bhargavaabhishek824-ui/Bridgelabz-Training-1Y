package Level_03;
import java.util.Arrays;

public class NumberCheckerExtended {

    public static int[] digitsArray(int number) {
        String str = String.valueOf(Math.abs(number));
        int[] digits = new int[str.length()];
        for (int i = 0; i < str.length(); i++) digits[i] = str.charAt(i) - '0';
        return digits;
    }

    // Sum of digits
    public static int sumOfDigits(int number) {
        int[] digits = digitsArray(number);
        int sum = 0;
        for (int d : digits) sum += d;
        return sum;
    }

    // Sum of squares of digits
    public static int sumOfSquaresOfDigits(int number) {
        int[] digits = digitsArray(number);
        int sum = 0;
        for (int d : digits) sum += Math.pow(d, 2);
        return sum;
    }

    // Check Harshad number
    public static boolean isHarshad(int number) {
        int sum = sumOfDigits(number);
        return number % sum == 0;
    }

    // Frequency of each digit
    public static int[][] digitFrequency(int number) {
        int[] digits = digitsArray(number);
        int[][] freq = new int[10][2];
        for (int i = 0; i < 10; i++) freq[i][0] = i; // digit
        for (int d : digits) freq[d][1]++; // frequency
        return freq;
    }

    public static void main(String[] args) {
        int number = 1729; // Example
        System.out.println("Number: " + number);

        System.out.println("Sum of digits: " + sumOfDigits(number));
        System.out.println("Sum of squares of digits: " + sumOfSquaresOfDigits(number));
        System.out.println("Is Harshad Number? " + isHarshad(number));

        System.out.println("Digit Frequencies:");
        int[][] freq = digitFrequency(number);
        for (int i = 0; i < freq.length; i++) {
            if (freq[i][1] > 0) {
                System.out.println("Digit " + freq[i][0] + " occurs " + freq[i][1] + " times");
            }
        }
    }
}