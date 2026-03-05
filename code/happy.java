package code;
import java.util.*;
public class happy {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String a="Abhishek";
		String b=sc.nextLine();
		System.out.println(b.length());
		int c=b.length();
		char ch;
		int v=0,C=0;
		for(int i=c-1;i>=0;i--) {
			System.out.print(b.charAt(i));
			if(b.charAt(i)=='A'||b.charAt(i)=='a'||b.charAt(i)=='E'||b.charAt(i)=='e'||b.charAt(i)=='I'||b.charAt(i)=='i'||b.charAt(i)=='u'||b.charAt(i)=='U'||b.charAt(i)=='O'||b.charAt(i)=='o') {
				v++;
			}
			else {
				C++;
				}
		}
		System.out.println("\n"+b.toLowerCase());
		System.out.println("\n"+b.toUpperCase());
		System.out.println("\n"+C+"\n"+v);
		System.out.println("\n"+b.replace("chamatkar","balatkar"));
		System.out.println("\n"+b.trim());
	}
}
