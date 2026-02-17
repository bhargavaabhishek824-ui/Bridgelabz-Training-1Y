package basic_programing;
import java.util.*;
public class calculator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("first no:");
		int a=sc.nextInt();
		System.out.println("second no:");
		int b=sc.nextInt();
		//System.out.println("");
		double c=a+b;
		double d=a-b;
		double e=a*b;
		double f=a/b;
		System.out.println("Addition: "+c);
		System.out.println("subtraction: "+d);
		System.out.println("multipication: "+e);
        System.out.println("Division: "+f);

	}

}
