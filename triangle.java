package basic_programing;
import java.util.*;
public class triangle {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		System.out.println("base=");
		int base=sc.nextInt();
		System.out.println("Height=");
		int height=sc.nextInt();
		
		double area=1.0/2.0*base*height;
		System.out.println("area of triangle is: "+area);
		

	}

}
