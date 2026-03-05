package code;
import java.util.*;
public class string {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int[] a= {10,40,20,30};
		Arrays.sort(a);
	  System.out.println(Arrays.toString(a));
	  int[] b=new int[5];//String s=sc.nextLine();
	  Arrays.fill(b,4);
	  System.out.println(Arrays.toString(b));
	 
			 int [] c=Arrays.copyOfRange(a, 0, 2);
			  System.out.println(Arrays.toString(c));//sort
			  int d=Arrays.binarySearch(a,20);
			  System.out.println(d);
	          

	}

}
