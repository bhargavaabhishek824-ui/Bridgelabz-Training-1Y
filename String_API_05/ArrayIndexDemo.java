package String_API_05;
import java.util.Scanner;

public class ArrayIndexDemo {

    public static void generateException(String[] names) {
        System.out.println(names[names.length]);
    }

    public static void handleException(String[] names) {
        try {
            System.out.println(names[names.length]);
        } 
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught");
        } 
        catch (RuntimeException e) {
            System.out.println("Runtime Exception caught");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] names = new String[3];

        for (int i = 0; i < names.length; i++) {
            System.out.print("Enter name: ");
            names[i] = sc.next();
        }

        System.out.println("Generating Exception:");
        generateException(names);

        System.out.println("Handling Exception:");
        handleException(names);

        sc.close();
    }
}