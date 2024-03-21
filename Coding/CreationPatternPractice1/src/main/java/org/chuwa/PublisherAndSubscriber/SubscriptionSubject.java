package org.chuwa.PublisherAndSubscriber;

import java.util.ArrayList;
import java.util.List;

public class SubscriptionSubject implements Subject {

	private List<Observer> userList = new ArrayList<>();
	@Override
	public void attach(Observer observer) {
		userList.add(observer);
	}

	@Override
	public void detach(Observer observer) {
		userList.remove(observer);
	}

	@Override
	public void notify(String msg) {
		for (Observer observer : userList) {
			observer.update(msg);
		}
	}
}
