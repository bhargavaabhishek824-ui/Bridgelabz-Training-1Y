package control_flow_level_1;
import java.util.*;
public class check_largest_number {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number\n");
		int a=sc.nextInt();
		System.out.println("Enter the second number\n");
		int b=sc.nextInt();
		System.out.println("Enter the third number\n");
		int c=sc.nextInt();
		if(a>b&&a>c) {
			System.out.println("first larger number\n");
	}
		else{
			System.out.println("first number is not larger\n");
	}
		if(b>a&&b>c) {
			System.out.println("second larger number\n");
	}
		else{
			System.out.println("second number is not larger\n");
	}
		if(c>b&&c>a) {
			System.out.println("third larger number\n");
	}
		else{
			System.out.println("third number is not larger\n");
	}
}
}