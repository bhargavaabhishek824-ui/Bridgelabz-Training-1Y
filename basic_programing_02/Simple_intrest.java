package basic_programing_02;
import java.util.*;
public class Simple_intrest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Amount:\n");
		int Amount=sc.nextInt();
		System.out.println("Enter the Rate:\n");
		int Rate=sc.nextInt();
		System.out.println("Enter the Time:\n");
		int Time=sc.nextInt();
		double  Simple_Intrest=(Amount*Rate*Time)/100;
		System.out.println("Simple of intrest:\n"+Simple_Intrest);

	}

}
