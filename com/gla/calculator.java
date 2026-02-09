package com.gla;
import java.util.*;
public class calculator {
	public int add(int num1,int num2) {
		return num1+num2;
	}
	public int sub(int num1,int num2) {
		return num1-num2;
	}
	public int mul(int num1,int num2) {
		return num1*num2;
	}
	public int div(int num1,int num2) {
		return num1/num2;
	}
      
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		calculator c=new calculator();
		System.out.println("1.Addition\n2.substraction\n3.multiplication\n4.divide\n");
		System.out.println("Enter number1:\n");
		int a=sc.nextInt();
		System.out.println("Enter number2:\n");
		int b=sc.nextInt();
		while(true) {
		int d=sc.nextInt();
		switch(d) {
		case 1:
		int addition=c.add(a,b);
		System.out.println("Addition:-\n"+addition);
		break;
		case 2:
		int substraction=c.sub(a,b);
		System.out.println("substraction:-\n"+substraction);
		break;
		case 3:
		int multiplication=c.mul(a,b);
		System.out.println("multiplication:-\n"+multiplication);
		break;
		case 4:
		int divide=c.div(a,b);
		System.out.println("divide:-\n"+divide);
       break;
	}
	}
}
}