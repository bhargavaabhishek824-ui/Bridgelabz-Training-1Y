package com.gla;

public class inheritance {

	public static void main(String[] args) {
		System.out.println("Animal class");
		Animal a=new Animal();
		a.Animal();
		System.out.println("---------------------------------------------------");
		System.out.println("Dog class");
		Dog D=new Dog();
		D.Dog();
		D.Animal();
		System.out.println("---------------------------------------------------");
		System.out.println("Puppy class");
		Puppy P=new Puppy();
		P.Animal();
		P.Dog();
		P.Puppy();
		System.out.println("---------------------------------------------------");
	}

}
