package programing_construct;

import java.util.Scanner;

class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        // Check natural number
        if (n <= 0) {
            System.out.println("The number " + n + " is not a natural number");
            return;
        }

        // Sum using formula
        int formulaSum = n * (n + 1) / 2;

        // Sum using while loop
        int loopSum = 0;
        int i = 1;
        while (i <= n) {
            loopSum = loopSum + i;
            i++;
        }

        // Compare results
        if (formulaSum == loopSum) {
            System.out.println("The sum of " + n + " natural numbers is " + loopSum);
            System.out.println("Both computations are correct");
        } else {
            System.out.println("Results are not matching");
        }
    }
}
