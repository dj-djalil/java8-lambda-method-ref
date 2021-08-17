package com.dz.anonymes;

public interface I {

	void show();
	default void print() {
		System.out.println(" default method from I interface ");
	}
}
