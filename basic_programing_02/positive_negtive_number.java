package basic_programing_02;
  import java.util.*;
public class positive_negtive_number {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your number:");
		int a=sc.nextInt();
		if(a>=0) {
			System.out.println("Positive Number");	
		}
		else{
			System.out.println("Negative Number");	
		}

	}

}
