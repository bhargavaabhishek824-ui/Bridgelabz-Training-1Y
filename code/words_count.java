package code;
import java.util.*;

public class words_count {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
    String a=sc.nextLine();
    int n=sc.nextInt();
    int c=1;
    for(int i=a.length()-1;i>=0;i--) {
    	if(a.charAt(i)==' ') {
    		c++;
    	}
    }
    int d=c-n;
    for(int i=d;i<a.length();i++) {
    	System.out.print(a.charAt(i));
    }
    System.out.println(c);
    
	}

}
