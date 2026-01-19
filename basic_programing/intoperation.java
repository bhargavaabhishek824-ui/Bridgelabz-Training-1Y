package basic_programing;
import java.util.*;
public class intoperation {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("first no:");
		int a=sc.nextInt();
		System.out.println("second no:");
		int b=sc.nextInt();
		System.out.println("third no:");
		int c=sc.nextInt();
		int p=a+b*c;
		int q=a*b+c;
		int r=c+a/b;
		int s=a%b+c;
		System.out.println("OPERATION 1: "+p);
		System.out.println("OPERATION 2: "+q);
		System.out.println("OPERATION 3: "+r);
        System.out.println("OPERATION 4: "+s);
        
	}

}
