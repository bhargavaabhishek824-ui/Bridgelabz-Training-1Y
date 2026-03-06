package Level_02;
import java.util.Scanner;

public class SumNaturalRecursion {

    // Recursive method to find sum of n natural numbers
    public static int sumRecursively(int n) {
        if (n == 1) return 1;
        return n + sumRecursively(n - 1);
    }

    // Method to calculate sum using formula
    public static int sumUsingFormula(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a natural number n: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a positive natural number.");
            sc.close();
            return;
        }

        int sumRec = sumRecursively(n);
        int sumForm = sumUsingFormula(n);

        System.out.println("Sum using recursion: " + sumRec);
        System.out.println("Sum using formula: " + sumForm);

        if (sumRec == sumForm) System.out.println("Both results match. ✅");
        else System.out.println("Results do not match. ❌");

        sc.close();
    }
}