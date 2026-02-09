package control_flow_level_1;
import java.util.*;
public class check_positive_negative_zero_number {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int a=sc.nextInt();
		if(a>0) {
			System.out.println("It is positive number:"+a);
		}
		else if(a<0){
			System.out.println("It is negative number:"+a);
		}
		else{
			System.out.println("It is zero:"+a);
		}
	}

}
