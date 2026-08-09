package Logic_Building;
import java.util.*;
public class Dublicate_Value_Remove {
public static void Dublicatevalue(int []arr) {
	for(int i=0;i<arr.length;i++) {
		for(int j=i+1;j<arr.length;j++) {
			if(arr[i]==arr[j]) {
				arr[i]=-1;
				arr[j]=-1;
			}
		}
	}
	for(int i=0;i<arr.length;i++) {
		if(arr[i]!=-1) {
			System.out.print(arr[i]);
		}
	}
}
public static void main (String[]args) {
	Scanner sc=new Scanner(System.in);
	int a=sc.nextInt();
	int []arr=new int[a];
	for(int i=0;i<arr.length;i++) {
		arr[i]=sc.nextInt();
		}
	 Dublicatevalue(arr);
}
}
