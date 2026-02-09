package basic_programing_02;
import java.util.*;
public class Convert_Kilometers_Miles {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter kilometer:\n");
		int a=sc.nextInt();
		double Miles = a * 0.621371;
		System.out.println("Miles:"+Miles);
	}

}
