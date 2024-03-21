package org.chuwa.PublisherAndSubscriber;

public class Client {
	public static void main(String[] args) {
		SubscriptionSubject subject = new SubscriptionSubject();

		subject.attach(new User("A"));
		subject.attach(new User("B"));
		subject.attach(new User("C"));

		subject.notify("test msg");

	}
}
