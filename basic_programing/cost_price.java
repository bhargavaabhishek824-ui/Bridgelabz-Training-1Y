package basic_programing;
import java.util.*;
public class cost_price {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter cost price");
		int c=sc.nextInt();
		System.out.println("Enter Selling price");
		int s=sc.nextInt();
		
		int profit=s-c;
		System.out.println("profit is; "+profit);
		
		int profitp=+profit*100/c;
		System.out.println("percentage is; "+profitp);
		
	}

}
