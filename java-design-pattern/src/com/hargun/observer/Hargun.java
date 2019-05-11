package com.hargun.observer;

public class Hargun implements ISubscriber {

	@Override
	public void showUpdate(String celeb, String message) {
		System.out.println("Update from :"+ celeb +", message : "+message);
	}

}
