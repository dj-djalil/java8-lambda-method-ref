package com.dz.j8.method_ref;

public class App {
	public static void main(String[] args) {

		// ref : static method
		Phone phone1 = SmartPhone::applay;
		phone1.show();
		
		// ref  : method using an object
		SmartPhone sPhone1 = new SmartPhone();
		Phone phone2 = sPhone1::display;
		phone2.show();
		
		// ref : Constructor
		Phone phone3 = SmartPhone::new;
		phone3.show();
		
	}
}
