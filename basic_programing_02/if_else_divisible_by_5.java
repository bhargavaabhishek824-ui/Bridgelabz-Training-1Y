package basic_programing_02;
  import java.util.*;
public class if_else_divisible_by_5 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your number:-\n");
		int a=sc.nextInt();
		if(a%5==0) {
			System.out.println("divisible by 5");
		}
		else{
			System.out.println("not divisible by 5");
		}
	}

}
