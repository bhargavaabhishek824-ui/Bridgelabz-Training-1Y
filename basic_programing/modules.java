package basic_programing;
import java.util.*;
public class modules {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("no.of pens");
		int p=sc.nextInt();
		System.out.println("no.of students");
		int s=sc.nextInt();
		System.out.println("distributed");
		int d=p-s;
		System.out.println("remaining ");
		int r=p%s;
		System.out.println("distributed pens ;"+d);
		System.out.println("remaining pens ;"+r);
		
	}

}
