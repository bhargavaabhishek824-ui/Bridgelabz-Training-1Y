package basic_programing_02;
import java.util.*;
public class Power_Calculation {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number:\n");
		int a=sc.nextInt();
		System.out.println("Enter power:\n");
		int b=sc.nextInt();
		double c=Math.pow(a,b);
		System.out.println("the power of that number :"+c);
	}
}
