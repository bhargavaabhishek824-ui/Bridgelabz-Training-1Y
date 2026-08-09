package Logic_Building;
import java.util.*;
public class First_Dublicate_Value {
public static int Firstdublicate(int arr[]) {
	for(int i=0;i<arr.length;i++) {
		for(int j=i+1;j<arr.length;j++) {
			if(arr[i]==arr[j]) {
				return (arr[i]);
			}
		}
	}
	return -1;
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int arr[]=new int[a];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.print(Firstdublicate(arr));
	}

}
