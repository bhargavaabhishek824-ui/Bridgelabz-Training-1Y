package palindrome;
import java.util.*;
public class fabonachi_series {

	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int a1=0,a2=1,a3=1;
		for(int i=0;i<=a;i++) {
			System.out.println("series is:\t"+a1);
			a3=a1+a2;
			a1=a2;//0111
			a2=a3;
		}

	}

}
