package Logic_Building;
import java.util.*;
public class SecondMinimumElement {
public static int minimum(int []arr) {
	int min=Integer.MAX_VALUE;
	for(int i=0;i<arr.length;i++) {
		if(min>arr[i]) {
			min=arr[i];
		}
	}
       return min;
}
public static int Secondmin(int arr[]) {
	int sec_min=minimum(arr);
	for(int i=0;i<arr.length;i++) {
		if(sec_min==arr[i]) {
			arr[i]=Integer.MAX_VALUE;
		}
	}
		int sec_mine=minimum(arr);
		return sec_mine;
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	  int a=sc.nextInt();
	  int arr[]=new int[a];
	  for(int i=0;i<arr.length;i++) {
		  arr[i]=sc.nextInt();
	  }
      System.out.print(Secondmin(arr));
	}

}
