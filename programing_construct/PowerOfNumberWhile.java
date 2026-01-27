package programing_construct;
import java.util.Scanner;

class PowerOfNumberWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the base number: ");
        int number = sc.nextInt();

        System.out.print("Enter the power (non-negative integer): ");
        int power = sc.nextInt();

        if (power < 0) {
            System.out.println("Please enter a non-negative power.");
            return;
        }

        int result = 1;      // initial value
        int counter = 0;     // counter variable

        while (counter < power) {  // loop until counter reaches power
            result = result * number;
            counter++;             // increment counter
        }

        System.out.println(number + " raised to the power " + power + " is " + result);
    }
}
