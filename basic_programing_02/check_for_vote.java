package basic_programing_02;
  import java.util.*;
public class check_for_vote {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age: ");
		int a=sc.nextInt();
		if(a>=18) {
			System.out.println("you can vote");
		}
		else{
			System.out.println("you can not vote");
		}
	}

}
