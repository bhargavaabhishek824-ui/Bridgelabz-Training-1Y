package code;
import java.util.*;
public class Old {
//hello himank kaisa hai re tu?
	//Or beta padhai kaise chal rahai hai?
	//public static void main(String[] args) {
	public static void mitali(){
		Scanner sc=new Scanner(System.in);
		String a=sc.nextLine();
		System.out.println(a.length());
		int w=1;
     for(int i=a.length()-1;i>=0;i--) {
    	 System.out.print(a.charAt(i));
    	 if(a.charAt(i)==' ') {
    		 w++;
    	 }
     }
     System.out.println("\n"+a.replace("hello himank","OR ladle"));
     System.out.println("\n"+a.replace("chamatkar","Balatkar"));
     System.out.println("\n"+a.replace("padhai kaise chal rahai hai","Chup bhankeland kaam te kaam rakh"));
     System.out.println("\n"+a.substring(6));
     System.out.println("\n"+a.toLowerCase()+"\n"+a.toUpperCase());
     int v=0,c=0;
     for(int i=a.length()-1;i>=0;i--) {
    	 if(a.charAt(i)=='a'||a.charAt(i)=='e'||a.charAt(i)=='i'||a.charAt(i)=='o'||a.charAt(i)=='u'||a.charAt(i)=='A'||a.charAt(i)=='E'||a.charAt(i)=='I'||a.charAt(i)=='O'||a.charAt(i)=='U') {
    		 v++;
    	 }
    	 else {
    		 c++;
    	 }
     }
     System.out.println("\nVOWEL:-"+v+"\nCONSONANT:-"+c);
     System.out.println("\nWords:-"+w);}
     public static void main(String[] args) {
    	 Scanner sc=new Scanner(System.in);
    	 System.out.println("Enter number how many time perform");
    	 int g=sc.nextInt();
    	 for(int i=1;i<=g;i++) {
    		 mitali();
    	 }
	}

}
