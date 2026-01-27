package programing_construct;
import java.util.Scanner;

class AbundantNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step b: Take input from user
        System.out.print("Enter an integer: ");
        int number = sc.nextInt();

        int sum = 0;  // Step c: initialize sum of divisors

        // Step d: Loop from 1 to number-1
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {  // Step e: check divisor
                sum += i;           // Step f: add divisor to sum
            }
        }

        // Step g & h: Check if sum > number
        if (sum > number) {
            System.out.println(number + " is an Abundant Number");
        } else {
            System.out.println(number + " is not an Abundant Number");
        }
    }
}
