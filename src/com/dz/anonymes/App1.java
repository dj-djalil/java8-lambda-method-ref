package com.dz.anonymes;

public class App1 {
	public static void main(String[] args) {

		// nested classes
		A a = new A();
		A.B b = a.new B();
		A.C c = new A.C();

		// les class Annonymes

		Fruit apple = new Apple();
		apple.abs();
		apple.show();

		Fruit annonyme = new Fruit() {

			int a = 10;

			@Override
			public void abs() {
				System.out.println("Annonymous class :: overriding abs method ");

			}

		};
		annonyme.abs();
		annonyme.show();

		I inter = new I() {

			@Override
			public void show() {
				System.out.println("hello from the interface");

			}

			// not oblige to do that just for demonstrate that you can do this 
			 public void print() {
					System.out.println(" redefine the :::: default method from I interface ");
				}
		};
		inter.show();
		inter.print();
		
		
	}

}
