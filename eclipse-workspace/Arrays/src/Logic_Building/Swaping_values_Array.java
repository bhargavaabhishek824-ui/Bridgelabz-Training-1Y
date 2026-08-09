package Logic_Building;
import java.util.*;
public class Swaping_values_Array {
    public static void Swap(int arr[],int a,int b) {
    		int temp=arr[a];
    	arr[a]=arr[b];
    	arr[b]=temp;
    	}
    public static void display(int arr[]) {
    	for(int i=0;i<arr.length;i++) {
    		System.out.print(arr[i]+" ");
    	}
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Size of array:-");
        int c=sc.nextInt();
        int arr[]=new int[c];
        for(int i=0;i<arr.length;i++) {
        	arr[i]=sc.nextInt();
        }
        System.out.print("give indexs:-");
        int a=sc.nextInt();
        int b=sc.nextInt();
        display(arr);
        System.out.print("\n");
          Swap(arr,a,b) ;
          display(arr);
	}
}
