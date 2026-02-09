package Level_1;
import java.util.*;
public class NumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];   // array of size 5
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }
        System.out.println("\n--- Number Checking ---");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                if (arr[i] % 2 == 0) {
                    System.out.println(arr[i] + " is Positive and Even");
                } else {
                    System.out.println(arr[i] + " is Positive and Odd");
                }
            }
            else if (arr[i] < 0) {
                System.out.println(arr[i] + " is Negative");
            }
            else {
                System.out.println(arr[i] + " is Zero");
            }
        }
        System.out.println("\n--- Comparing First and Last Element ---");

        if (arr[0] == arr[4]) {
            System.out.println("First element (" + arr[0] + ") is EQUAL to last element (" + arr[4] + ")");
        } 
        else if (arr[0] > arr[4]) {
            System.out.println("First element (" + arr[0] + ") is GREATER than last element (" + arr[4] + ")");
        } 
        else {
            System.out.println("First element (" + arr[0] + ") is LESS than last element (" + arr[4] + ")");
        }
    }
}
