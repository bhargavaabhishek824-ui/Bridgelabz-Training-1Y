package basic_programing_02;
   import java.util.*;
public class comparision_02 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number A:\n");
		int a=sc.nextInt();
		System.out.println("Enter number B:\n");
		int b=sc.nextInt();
		System.out.println("Enter number C:\n");
		int c=sc.nextInt();
		if(a<b&&b<c) {
			System.out.println("Smallest number:\n"+a);
			System.out.println("Greatest number:\n"+c);
		}
		else {
			System.out.println("No order found");
		}
	}

}
