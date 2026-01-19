package basic_programing;
import java.util.*;
public class intoperationpart_2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("first no:");
		double a=sc.nextInt();
		System.out.println("second no:");
		double b=sc.nextInt();
		System.out.println("third no:");
		double c=sc.nextInt();
		double p=a+b*c;
		double q=a*b+c;
		double r=c+a/b;
		double s=a%b+c;
		System.out.println("OPERATION 1 :"+p);
		System.out.println("OPERATION 2 :"+q);
		System.out.println("OPERATION 3 :"+r);
        System.out.println("OPERATION 4 :"+s);


	}

}
