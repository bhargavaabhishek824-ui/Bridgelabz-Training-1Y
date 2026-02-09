package control_flow_level_1;
import java.util.*;
public class check_divisible_by_5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number: \n");
		int a=sc.nextInt();
		if(a%5==0) {
			System.out.println("\n It is divisible by 5");
		}
		else{
			System.out.println("\n It is not divisible by 5");
		}

	}

}
