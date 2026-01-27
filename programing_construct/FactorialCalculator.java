package programing_construct;

import java.util.Scanner;

class FactorialCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
            return;
        }

        long factorial = 1;  // use long to handle larger numbers
        int i = 1;

        while (i <= number) {
            factorial = factorial * i;
            i++;
        }

        System.out.println("Factorial of " + number + " is " + factorial);
    }
}
