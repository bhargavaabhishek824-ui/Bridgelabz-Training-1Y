package Logic_Building;

import java.util.Scanner;

public class Reverse_Arrays {
public static void Reverse(int arr[]) {
	 int i=0;
	 int j=arr.length-1;
	 while(i<j) {
		 int temp=arr[i];
		 arr[i]=arr[j];
		 arr[j]=temp;
		 i++;
		 j--;
	 }
}
public static void display(int arr[]) {
	 for(int i=0;i<arr.length;i++) {
		 System.out.print(arr[i]+" ");
	 }
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int arr[]=new int[a];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		display(arr);
		Reverse(arr);
		System.out.print("\n");
		display(arr);

	}

}
