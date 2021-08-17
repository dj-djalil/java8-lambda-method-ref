package com.dz.anonymes;


/**
 * 
 * @author djalil
 *
 * how to use nested classes 
 */
public final class A {
	private String i = " Hi A !";

	public String getI() {
		return i;
	}

	public class B {
		private String j = "Hi B !";

		public String getJ() {
			return j;
		}
	}

	public static class C {
		private String e = " Hi C !";

		public String getE() {
			return e;
		}
	}
}
