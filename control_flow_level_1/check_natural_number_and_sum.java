package control_flow_level_1;
import java.util.*;
public class check_natural_number_and_sum {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:\n");
		int a=sc.nextInt();
		if(a>=1) {
			System.out.println("It is natural number\n");
			int b;
			b=(a*(a+1))/2;
			System.out.println("Sum of natural number:\n"+b);
		}
		else {
			System.out.println("The number is not a natural number\n"+a);
		}

	}

}
