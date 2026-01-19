package basic_programing;
import java.util.*;
public class yard_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter distance in feet: ");
        int feet = sc.nextInt();

        int yards = feet / 3;
        int miles = yards / 1760;

        System.out.println("Distance in feet is " + feet +
                           " \nwhile in yards is " + yards +
                           "\n and in miles is " + miles);

	}

}
