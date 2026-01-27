package programing_construct;

import java.util.Scanner;

class GreatestFactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int greatestFactor = 1; // default value

        // Loop from number-1 down to 1
        for (int i = number - 1; i >= 1; i--) {
            if (number % i == 0) { // check if divisible
                greatestFactor = i;
                break; // exit loop once the greatest factor is found
            }
        }

        System.out.println("The greatest factor of " + number + " besides itself is " + greatestFactor);
    }
}
