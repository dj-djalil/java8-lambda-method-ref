package com.dz.j8.lambda;

import java.util.function.Function;

public class App {
	public static void main(String[] args) {

		functional_Interface f = () ->123;

		f.hello();
		f.show();

	}
}
