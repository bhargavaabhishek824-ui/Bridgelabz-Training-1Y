package basic_programing_02;
import java.util.*;
public class Average_3_numbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first number:\n");
		int a=sc.nextInt();
		System.out.println("Enter the second number:\n");
		int b=sc.nextInt();
		System.out.println("Enter the third number:\n");
		int c=sc.nextInt();
		double Average_3_numbers =(a+b+c)/3;
		System.out.println("Average of 3 of 2numbers:\n"+Average_3_numbers);

	}

}
