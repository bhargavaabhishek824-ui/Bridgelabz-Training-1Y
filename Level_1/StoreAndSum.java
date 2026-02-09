package Level_1;
import java.util.*;
public class StoreAndSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] arr = new double[10]; 
        double total = 0.0;           
        int index = 0;                 

        System.out.println("Enter numbers (0 or negative to stop):");
        while (true) {
            System.out.print("Enter number: ");
            double num = sc.nextDouble();
            if (num <= 0) {
                break;
            }
            if (index == 10) {
                System.out.println("Array limit reached (10 values).");
                break;
            }
            arr[index] = num;
            index++;
        }
        for (int i = 0; i < index; i++) {
            total += arr[i];
        }
        System.out.println("\n--- Numbers Entered ---");
        for (int i = 0; i < index; i++) {
            System.out.println(arr[i]);
        }
        System.out.println("\nTotal Sum = " + total);
    }
}
