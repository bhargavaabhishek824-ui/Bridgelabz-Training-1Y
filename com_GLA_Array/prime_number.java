package com_GLA_Array;
import java.util.*;
public class prime_number {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.println("Enter number");
        int a = sc.nextInt();
//        System.out.println("Enter number");
//        int b = sc.nextInt();
        for(int j=a;j>=1;j--) {
        	for(int i=1;i<=j;i++) {
        		System.out.println("*");
        	}
        	System.out.println("\n");
        }
        
        	}
}
