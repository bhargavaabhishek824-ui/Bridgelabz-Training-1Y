package Level_03;
public class NumberCheckerAdvanced {

    // Sum of proper divisors
    public static int sumOfDivisors(int number) {
        int sum = 0;
        for (int i = 1; i <= number / 2; i++)
            if (number % i == 0) sum += i;
        return sum;
    }

    // Check perfect number
    public static boolean isPerfect(int number) {
        return sumOfDivisors(number) == number;
    }

    // Abundant number
    public static boolean isAbundant(int number) {
        return sumOfDivisors(number) > number;
    }

    // Deficient number
    public static boolean isDeficient(int number) {
        return sumOfDivisors(number) < number;
    }

    // Factorial helper
    public static int factorial(int n) {
        int fact = 1;
        for (int i = 2; i <= n; i++) fact *= i;
        return fact;
    }

    // Strong number
    public static boolean isStrong(int number) {
        int[] digits = NumberChecker.digitsArray(number);
        int sum = 0;
        for (int d : digits) sum += factorial(d);
        return sum == number;
    }

    public static void main(String[] args) {
        int number = 145;
        System.out.println("Number: " + number);
        System.out.println("Perfect? " + isPerfect(number));
        System.out.println("Abundant? " + isAbundant(number));
        System.out.println("Deficient? " + isDeficient(number));
        System.out.println("Strong? " + isStrong(number));
    }
}