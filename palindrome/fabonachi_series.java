package palindrome;
import java.util.*;
public class fabonachi_series {

	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
//		int a=sc.nextInt();
//		int a1=0,a2=1,a3=1;
//		for(int i=0;i<=a;i++) {
//			System.out.println("series is:\t"+a1);
//			a3=a1+a2;
//			a1=a2;//0111
//			a2=a3;
			
		//}
		//Scanner sc = new Scanner(System. in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int temp = 0;
		for (int i = 1; i <= b; i++) {
		if (a% i == 0&& b% i == 0) {
		temp = i;
		}
		}
		System.out.println(temp);
//		System.out.ptintln(Math.pow(2,3));

	}

}
