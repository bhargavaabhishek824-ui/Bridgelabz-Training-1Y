package programing_construct;
import java.util.Scanner;

class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step a: Take integer input
        System.out.print("Enter an integer: ");
        int number = sc.nextInt();

        // Handle negative numbers
        number = Math.abs(number);

        // Step b: Initialize count
        int count = 0;

        // Step c: Loop until number becomes 0
        if (number == 0) {
            count = 1; // special case for 0
        } else {
            while (number != 0) {
                number = number / 10; // Step d: remove last digit
                count++;               // Step e: increment count
            }
        }

        // Step f: Display the count
        System.out.println("Number of digits: " + count);
    }
}
