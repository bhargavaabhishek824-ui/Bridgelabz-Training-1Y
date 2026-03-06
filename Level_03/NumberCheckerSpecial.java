package Level_03;
public class NumberCheckerSpecial {

    // Check prime
    public static boolean isPrime(int number) {
        if (number <= 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i++)
            if (number % i == 0) return false;
        return true;
    }

    // Check neon number
    public static boolean isNeon(int number) {
        int square = number * number;
        int sum = 0;
        while (square > 0) {
            sum += square % 10;
            square /= 10;
        }
        return sum == number;
    }

    // Check spy number
    public static boolean isSpy(int number) {
        int sum = 0, prod = 1;
        int n = number;
        while (n > 0) {
            int d = n % 10;
            sum += d;
            prod *= d;
            n /= 10;
        }
        return sum == prod;
    }

    // Check automorphic number
    public static boolean isAutomorphic(int number) {
        int square = number * number;
        String strNum = String.valueOf(number);
        String strSquare = String.valueOf(square);
        return strSquare.endsWith(strNum);
    }

    // Check buzz number
    public static boolean isBuzz(int number) {
        return number % 7 == 0 || number % 10 == 7;
    }

    public static void main(String[] args) {
        int number = 7;
        System.out.println("Number: " + number);
        System.out.println("Prime? " + isPrime(number));
        System.out.println("Neon? " + isNeon(number));
        System.out.println("Spy? " + isSpy(number));
        System.out.println("Automorphic? " + isAutomorphic(number));
        System.out.println("Buzz? " + isBuzz(number));
    }
}