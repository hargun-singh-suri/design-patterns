package com.hargun.factory.java7;

public class BasicTax implements Tax {

	@Override
	public void tax() {
		System.out.println("This is Basic Tax of 10%");		
	}

}
