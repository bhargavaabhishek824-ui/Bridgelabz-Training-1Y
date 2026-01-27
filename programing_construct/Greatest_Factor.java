package programing_construct;

import java.util.Scanner;

public class Greatest_Factor{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }

        int greatestFactor = 1;          // Initializ
        int counter = number - 1;        // Start from number-1

        while (counter >= 1) {
            if (number % counter == 0) { // Perfectly divisible
                greatestFactor = counter;
                break;                   // Stop at the first (greatest) factor
            }
            counter--;
        }

        System.out.println("The greatest factor of " + number + " besides itself is " + greatestFactor);
    }
}
