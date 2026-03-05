package String_API_05;
import java.util.Scanner;

public class IllegalArgumentDemo {

    // Method to generate exception
    public static void generateException(String text) {

        int start = 5;
        int end = 2;

        // start index greater than end index
        String result = text.substring(start, end);

        System.out.println(result);
    }

    // Method to handle exception
    public static void handleException(String text) {

        int start = 5;
        int end = 2;

        try {
            String result = text.substring(start, end);
            System.out.println("Substring: " + result);
        } 
        catch (IllegalArgumentException e) {
            System.out.println("Exception caught: IllegalArgumentException");
            System.out.println("Start index cannot be greater than end index.");
        } 
        catch (RuntimeException e) {
            System.out.println("Generic Runtime Exception caught.");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

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