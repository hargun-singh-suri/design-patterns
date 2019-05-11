package com.hargun.observer;

public class MainObserverPattern {

	public static void main(String args[]) {

		System.out.println("Create Celebrity");
		SalmanKhan celeb = new SalmanKhan();
		System.out.println("Create Subscriber");
		ISubscriber subscriberOne = new Hargun();
		System.out.println("Add subscriber to Celeb list");
		celeb.subscribe(subscriberOne);
		System.out.println("Send update to subscriber");
		celeb.updateMyFollowers("Hey !! Fans comming to Pheonix Next week");
	}

}
