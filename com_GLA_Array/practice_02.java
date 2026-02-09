package com_GLA_Array;
import java.util.*;
public class practice_02 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    System.out.println("Enter starting number\n");
	    int a=sc.nextInt();
	    System.out.println("Enter the Ending\n");
	    int d=sc.nextInt();
	    int c=1;
	    
	    if(a==1) {
	      c = 1;	
	    } 
  for (int i=a;i<=d;i++) {
        c=0;
	 for(int j=2;j<=i;j++) {
	  if(i%j==0) {
		  c++;
	  }
	 }
  if(c==2) {
	  System.out.println("prime number\t"+i);
  }
  }
	}

}
