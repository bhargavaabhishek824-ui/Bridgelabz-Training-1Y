package Level_01;
import java.util.Scanner;

public class NumberCheck {

    // Method to check number
    public static int checkNumber(int number) {
        if (number > 0) return 1;
        else if (number < 0) return -1;
        else return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        int result = checkNumber(num);

        if (result == 1) System.out.println(num + " is Positive");
        else if (result == -1) System.out.println(num + " is Negative");
        else System.out.println(num + " is Zero");

        sc.close();
    }
}