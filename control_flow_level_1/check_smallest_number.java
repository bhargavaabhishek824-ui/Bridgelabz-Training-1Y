package control_flow_level_1;
import java.util.*;
public class check_smallest_number {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first number");
		int a=sc.nextInt();
		System.out.println("Enter second number");
		int b=sc.nextInt();
		System.out.println("Enter third number");
		int c=sc.nextInt();
		if(a<b&&a<c||b<c) {
			System.out.println("first smallest number:\n"+a);
		}
		else{
			System.out.println("first number is not smallest");
		}
	}

}
