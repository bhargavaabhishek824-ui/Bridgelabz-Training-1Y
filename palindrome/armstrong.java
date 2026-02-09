package palindrome;
import java.util.*;
public class armstrong {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number");
		int a=sc.nextInt();
		int b=a,c=0;
		while(a>0) {
			c=c+(a%10)*(a%10)*(a%10);
			a=a/10;
		}
		if(b==c) {
			System.out.println("Armstrong number");
		}
		else{
			System.out.println("Not Armstrong number");
		}
	}

}
