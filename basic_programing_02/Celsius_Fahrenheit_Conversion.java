package basic_programing_02;
import java.util.*;
public class Celsius_Fahrenheit_Conversion {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Celsius\n");
		int Celsius=sc.nextInt();
		int Fahrenheit = ((Celsius*9)/5)+32;
		System.out.println("Fahrenheit\n"+Fahrenheit);

	}

}
