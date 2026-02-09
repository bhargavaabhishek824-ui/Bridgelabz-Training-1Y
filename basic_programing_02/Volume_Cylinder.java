package basic_programing_02;
import java.util.*;
public class Volume_Cylinder {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the radius:\n");
		int radius=sc.nextInt();
		System.out.println("Enter the height:\n");
		int height=sc.nextInt();
		double  Volume=3.14*radius*radius*height;
		System.out.println("Volume of Cylinder:\n"+Volume);
	}

}
