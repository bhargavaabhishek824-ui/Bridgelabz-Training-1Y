package String_API_05;
import java.util.Scanner;

public class NumberFormatDemo {

    // Method to generate exception
    public static void generateException(String text) {

        // This will cause NumberFormatException if text is not a number
        int number = Integer.parseInt(text);

        System.out.println("Number is: " + number);
    }

    // Method to handle exception
    public static void handleException(String text) {

        try {
            int number = Integer.parseInt(text);
            System.out.println("Number is: " + number);
        }
        catch (NumberFormatException e) {
            System.out.println("Exception caught: NumberFormatException");
            System.out.println("Input string is not a valid number.");
        }
        catch (RuntimeException e) {
            System.out.println("Generic Runtime Exception caught.");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        String text = sc.next();

        // 1️⃣ Call method to generate exception
        System.out.println("\nGenerating Exception:");
        generateException(text);

        // 2️⃣ Call method to handle exception
        System.out.println("\nHandling Exception:");
        handleException(text);

        sc.close();
    }
}