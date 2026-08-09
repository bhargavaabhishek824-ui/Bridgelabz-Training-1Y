package Logic_Building;
import java.util.*;
public class basic {
	public static void prime(int a) {
		int c=0;
		if(a<=1) {
			System.out.println("not prime no.");
		}
		for(int i=2;i<=a;i++) {
			if(a%i==0) {
				c++;
			}
		}
		if(c==1) {
			System.out.println("prime no.");
		}
		else{
			System.out.println("not prime no.");
		}
	}
	public static void reverse(int a[]) {
		int i=0,j=a.length-1;
       while(i<j){
    	   int temp=a[i];
    	   a[i]=a[j];
    	   a[j]=temp;
    	   i++;
    	   j--;
       }
	}
	public static void display(int a[]) {
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
	}
public static void main(String[]args) {
	Scanner sc=new Scanner(System.in);
	//int a=sc.nextInt();
	//int b=sc.nextInt();
	System.out.println(Integer.MAX_VALUE);
//	int []arr=new int[a];
//	for(int i=0;i<arr.length;i++) {
//		arr[i]=sc.nextInt();
//	}
//	System.out.print("target value");
//	int b=sc.nextInt();
//	for(int i=0;i<arr.length;i++) {
//		if(b==arr[i]) {
//			System.out.println(i);;
//		}
//	}
	//linearsearch(arr);
//	reverse(arr);
//	display(arr);
	
}

}
