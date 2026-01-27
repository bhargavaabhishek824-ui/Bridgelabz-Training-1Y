package programing_construct;
import java.util.Scanner;

class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step a & b: Take input and initialize variables
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int sum = 0;               // to store sum of cubes
        int originalNumber = number; // keep original number for comparison

        // Step c: Loop until originalNumber becomes 0
        while (originalNumber != 0) {
            int digit = originalNumber % 10;   // Step d: get last digit
            sum += digit * digit * digit;      // Step d: cube the digit and add to sum
            originalNumber = originalNumber / 10; // Step e: remove last digit
        }

        // Step f: Compare sum with original number
        if (sum == number) {
            System.out.println(number + " is an Armstrong Number");
        } else {
            System.out.println(number + " is not an Armstrong Number");
        }
    }
}
