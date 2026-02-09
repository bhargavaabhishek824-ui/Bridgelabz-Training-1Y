package palindrome;
import java.util.*;
public class palindrome {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:\n");
		int a=sc.nextInt();
		int b=a,c=0;
		while(a>0) {
			c=c*10+(a%10);
			a=a/10;
		}
		if(b==c) {
        	System.out.println("Palindrome");
        	
        }
        else{
        	System.out.println("Not Palindrome");
        	
        }
	}

}
