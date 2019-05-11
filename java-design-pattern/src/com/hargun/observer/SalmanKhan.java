package com.hargun.observer;

import java.util.ArrayList;
import java.util.List;

public class SalmanKhan implements ICeleb {
	
	List<ISubscriber> subscribers = new ArrayList<ISubscriber>();

	public void updateMyFollowers(String message) {
		notifySubsriber(message);
	}
	
	@Override
	public void subscribe(ISubscriber subscriber) {
		subscribers.add(subscriber);
	}

	@Override
	public void unSubscribe(ISubscriber subscriber) {
		subscribers.remove(subscriber);
	}

	@Override
	public void notifySubsriber(String message) {
		for(ISubscriber subscriber : subscribers) {
			subscriber.showUpdate(this.getClass().getSimpleName(),message );
		}
	}

}
