package com.dz.j8.lambda;

@FunctionalInterface
public interface functional_Interface {

	
	double show ();
	
	//void call();
	default void hello () {
		System.out.println("Hi man ! ");
	}
	
}
