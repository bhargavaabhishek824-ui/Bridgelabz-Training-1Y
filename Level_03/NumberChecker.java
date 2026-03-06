package Level_03;
public class NumberChecker {

    // Count digits
    public static int countDigits(int number) {
        return String.valueOf(Math.abs(number)).length();
    }

    // Store digits in array
    public static int[] digitsArray(int number) {
        String str = String.valueOf(Math.abs(number));
        int[] digits = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            digits[i] = str.charAt(i) - '0';
        }
        return digits;
    }

    // Check if duck number (contains at least one non-zero digit)
    public static boolean isDuckNumber(int number) {
        int[] digits = digitsArray(number);
        for (int d : digits) if (d != 0) return true;
        return false;
    }

    // Check Armstrong number
    public static boolean isArmstrong(int number) {
        int[] digits = digitsArray(number);
        int n = digits.length;
        int sum = 0;
        for (int d : digits) sum += Math.pow(d, n);
        return sum == number;
    }

    // Find largest and second largest digits
    public static int[] largestAndSecondLargest(int[] digits) {
        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        for (int d : digits) {
            if (d > largest) {
                second = largest;
                largest = d;
            } else if (d > second && d != largest) {
                second = d;
            }
        }
        return new int[]{largest, second};
    }

    // Find smallest and second smallest digits
    public static int[] smallestAndSecondSmallest(int[] digits) {
        int smallest = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        for (int d : digits) {
            if (d < smallest) {
                second = smallest;
                smallest = d;
            } else if (d < second && d != smallest) {
                second = d;
            }
        }
        return new int[]{smallest, second};
    }

    // Main method to test NumberChecker
    public static void main(String[] args) {
        int number = 153; // Example number
        int[] digits = digitsArray(number);

        System.out.println("Number: " + number);
        System.out.println("Digit count: " + countDigits(number));
        System.out.println("Digits array: ");
        for (int d : digits) System.out.print(d + " ");
        System.out.println();
        System.out.println("Is Duck Number? " + isDuckNumber(number));
        System.out.println("Is Armstrong Number? " + isArmstrong(number));

        int[] largest = largestAndSecondLargest(digits);
        System.out.println("Largest: " + largest[0] + ", Second Largest: " + largest[1]);

        int[] smallest = smallestAndSecondSmallest(digits);
        System.out.println("Smallest: " + smallest[0] + ", Second Smallest: " + smallest[1]);
    }
}