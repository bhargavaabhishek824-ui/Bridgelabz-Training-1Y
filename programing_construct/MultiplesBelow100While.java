package programing_construct;

import java.util.Scanner;

class MultiplesBelow100While {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive integer less than 100: ");
        int number = sc.nextInt();

        if (number <= 0 || number >= 100) {
            System.out.println("Invalid input! Please enter a positive number less than 100.");
            return;
        }

        System.out.println("Multiples of " + number + " below 100 are:");

        int counter = 100; // Start from 100

        while (counter >= 1) {
            if (counter % number == 0) { // Check if counter is a multiple
                System.out.println(counter);
            }
            counter--;
        }
    }
}
