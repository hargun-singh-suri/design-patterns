package com.hargun.singleton;

public class SingletonExample {

	private SingletonExample() {

	}

	private static class SingletonHelper {
		//Due to final keyword object initialization will take place only once in a JVM Session
		private static final SingletonExample singletonObj = new SingletonExample();
	}

	public static SingletonExample getSingletonObject() {
		return SingletonHelper.singletonObj;
	}

}
