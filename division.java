package basic_programing;
import java.util.*;
public class division {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("First no. = ");
		int a=sc.nextInt();
		System.out.println("Second no. =  ");
		int b=sc.nextInt();		
		int q=a/b;
		int r=a%b;
		System.out.println("Quitotent is = "+q);
		System.out.println("remainder is = "+r);
}
}