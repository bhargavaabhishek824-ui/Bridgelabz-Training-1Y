package palindrome;
import java.util.*;
public class prime_number {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println ("Enter number:\n");
		int a=sc.nextInt();
		int c=0;
		if(a==1) {
			c=0;
		}
		for(int i=2;i<=a;i++) {
			if(a%i==0) {
				c++;
			}
		}
       if(c==1) {
    	  System.out.println ("Prime number");
       }
       else {
    	   System.out.println ("Not Prime number");
       }
	}

}
