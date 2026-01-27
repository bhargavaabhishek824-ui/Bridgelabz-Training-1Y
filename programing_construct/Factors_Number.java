package programing_construct;

import java.util.Scanner;

class Factors_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int number = sc.nextInt();

        if (number <= 0) {
            System.out.println("Please enter a positive integer.");
            return;
        }

        System.out.print("Factors of " + number + " are: ");

        int counter = 1;

        while (counter <= number) {
            if (number % counter == 0) {   // perfectly divisible
                System.out.print(counter + " ");
            }
            counter++;
        }

        System.out.println(); // for newline at the end
    }
}
