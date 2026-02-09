package control_flow_level_1;
import java.util.*;
public class check_age_for_vote {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age");
		int a=sc.nextInt();
		if(a<=18) {
			System.out.println("you can vote");
		}
		else {
			System.out.println("you cannot vote");
		}
	}

}
