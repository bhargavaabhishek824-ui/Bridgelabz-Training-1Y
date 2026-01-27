package programing_construct;

import java.util.Scanner;

class PrimeCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        boolean isPrime = true;  // assume number is prime

        if (number <= 1) {
            isPrime = false;  // numbers <= 1 are not prime
        } else {
            // check for factors from 2 to number-1
            for (int i = 2; i <= number - 1; i++) {
                if (number % i == 0) {
                    isPrime = false;  // divisible by some number
                    break;            // exit loop
                }
            }
        }

        if (isPrime) {
            System.out.println(number + " is a Prime Number");
        } else {
            System.out.println(number + " is not a Prime Number");
        }
    }
}
