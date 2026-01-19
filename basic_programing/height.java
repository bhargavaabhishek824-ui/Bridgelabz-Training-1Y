package basic_programing;
import java.util.*;
public class height {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter height in cm");
		int a=sc.nextInt();
		//System.out.println("height in inches");
		double b=a/2.54;
		//System.out.println("height in feet");
		double c=b*12;
		System.out.println("height in inches"+b);
		System.out.println("height in feet"+c);
		

	}

}
