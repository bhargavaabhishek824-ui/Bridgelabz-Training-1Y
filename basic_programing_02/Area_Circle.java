package basic_programing_02;
import java.util.*;
public class Area_Circle {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the radius:\n");
		int radius=sc.nextInt();
		double Area=3.14*radius*radius;
		System.out.println("Area of Circle:\n"+Area);

	}

}
