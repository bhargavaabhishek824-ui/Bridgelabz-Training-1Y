package Logic_Building;
import java.util.*;
public class SecondMaximumElement {
    public static int MaxElement(int arr[]) {
    	int max=Integer.MIN_VALUE;
    	for(int i=0;i<arr.length;i++) {
    		if(max<arr[i]) {
    			max=arr[i];
    		}
    	}
    	return max;
    }
    public static int SecondMax(int arr[]) {
    	int max=MaxElement(arr);
    	for(int i=0;i<arr.length;i++) {
    		if(arr[i]==max) {
        		arr[i]=Integer.MIN_VALUE;
        	}
    	}
    	int secondmax=MaxElement(arr);
    	return secondmax;
    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int arr[]=new int[a];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		System.out.print(SecondMax(arr));
	}

}
