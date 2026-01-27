package programing_construct;
import java.util.Scanner;

class HarshadNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step b: Take input from user
        System.out.print("Enter an integer: ");
        int number = sc.nextInt();

        int originalNumber = number; // store original numbe
        int sum = 0;                 // Step c: initialize sum

        // Step d: while loop to calculate sum of digits
        while (number != 0) {
            int digit = number % 10;  // get last digit
            sum += digit;             // Step e: add digit to sum
            number = number / 10;     // remove last digit
        }

        // Step f & g: check divisibility
        if (originalNumber % sum == 0) {
            System.out.println(originalNumber + " is a Harshad Number");
        } else {
            System.out.println(originalNumber + " is not a Harshad Number");
        }
    }
}
