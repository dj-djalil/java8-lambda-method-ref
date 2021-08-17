package com.dz.j8.function;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class App1 {

	class Student {
		private String name;
		private int age;

		public Student(String name, int age) {
			this.name = name;
			this.age = age;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		@Override
		public String toString() {
			 
			return  "[ name : "+this.name+" , age : "+this.age +" ]";
		}

	}

	public static void main(String[] args) {

		App1 a =new App1();
		// cuz i have a nested class 'inner class'
		
		// Function<T,R> -> R apply(T t)
		Function <Student,String> func = (s)->s.getName();
		
		Student s1 = a.new Student("Karim", 23);
		System.out.println(func.apply(s1));
		
		// Predicate<T> ->  boolean test (T t)
		Predicate<Student> pr = (s)->s.getAge()<18;
		Student s2 = a.new Student("salim",18);
		System.out.println("Is "+s2.getName()+" < 18 ? : "+ pr.test(s2));
		
		// Consumer<T> -> void accept(T t)
		
		Consumer<Student> consumer = (s)->{s.setName("Dr."+s.getName());};
		Student s3 = a.new Student("zakaria", 27);
		consumer.accept(s3);
		System.out.println(s3.getName());
		
		// Supplier<T> -> T get()
		
		Supplier<Student> supplier = ()-> a.new Student("Islam",27);
		System.out.println(supplier.get());
		
		 
	}

}
