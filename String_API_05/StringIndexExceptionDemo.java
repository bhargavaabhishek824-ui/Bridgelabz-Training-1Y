package String_API_05;
import java.util.Scanner;

public class StringIndexExceptionDemo {

    // Method to generate exception
    public static void generateException(String text) {

        // Accessing index beyond length
        System.out.println("Character is: " + text.charAt(text.length() + 2));
    }

    // Method to handle exception
    public static void handleException(String text) {

        try {
            System.out.println("Character is: " + text.charAt(text.length() + 2));
        } 
        catch (StringIndexOutOfBoundsException e) {
            System.out.println("Exception caught: StringIndexOutOfBoundsException");
            System.out.println("You tried to access index beyond the string length.");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // taking user input
        System.out.print("Enter a string: ");
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