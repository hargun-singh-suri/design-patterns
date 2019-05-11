package com.hargun.observer;

public interface ICeleb {
	public void subscribe(ISubscriber observer);

	public void unSubscribe(ISubscriber observer);

	public void notifySubsriber(String message);
}
