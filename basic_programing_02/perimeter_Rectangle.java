package basic_programing_02;
import java.util.*;
public class perimeter_Rectangle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the length:\n");
		int length=sc.nextInt();
		System.out.println("Enter the width:\n");
		int width=sc.nextInt();
		double  perimeter_Rectangle=2*(length+ width);
		System.out.println("perimeter of Rectangle :n\n"+perimeter_Rectangle);

	}

}
