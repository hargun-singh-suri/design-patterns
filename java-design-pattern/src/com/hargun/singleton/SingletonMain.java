package com.hargun.singleton;

public class SingletonMain {

	public static void main(String args[]) {
		System.out.println("Singleton demo");
		System.out.println("Creating instance of the class...1");
		SingletonExample obj1 = SingletonExample.getSingletonObject();
		System.out.println("Creating another instance of the class...2");
		SingletonExample obj2 = SingletonExample.getSingletonObject();
		System.out.println("Compare instance of the class");
		if(obj1.equals(obj2)) {
			System.out.println("Object are same");
		}else {
			System.out.println("Object are different");
		}
		
		
	}
}
