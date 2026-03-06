package Level_02;
import java.util.Scanner;

public class FactorsCalculator {

    // Method to find factors and return array
    public static int[] findFactors(int number) {
        int count = 0;

        // Count number of factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) count++;
        }

        int[] factors = new int[count];
        int index = 0;

        // Save factors to array
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) factors[index++] = i;
        }

        return factors;
    }

    // Method to calculate sum of factors
    public static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int f : factors) sum += f;
        return sum;
    }

    // Method to calculate product of factors
    public static int productOfFactors(int[] factors) {
        int product = 1;
        for (int f : factors) product *= f;
        return product;
    }

    // Method to calculate sum of squares of factors
    public static int sumOfSquaresOfFactors(int[] factors) {
        int sum = 0;
        for (int f : factors) sum += Math.pow(f, 2);
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int[] factors = findFactors(number);

        System.out.print("Factors of " + number + " are: ");
        for (int f : factors) System.out.print(f + " ");
        System.out.println();

        System.out.println("Sum of factors: " + sumOfFactors(factors));
        System.out.println("Sum of squares of factors: " + sumOfSquaresOfFactors(factors));
        System.out.println("Product of factors: " + productOfFactors(factors));

        sc.close();
    }
}