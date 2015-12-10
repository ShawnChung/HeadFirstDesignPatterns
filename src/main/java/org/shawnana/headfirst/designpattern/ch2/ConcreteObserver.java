package org.shawnana.headfirst.designpattern.ch2;

public class ConcreteObserver implements Observer, Runnable {
	private static int counter = 0;
	private Subject subject = null;
	private final int id = counter++;
	
	public ConcreteObserver(Subject subject) {
		if (subject != null) {
			this.subject = subject;
			subject.registObserver(this);
		}
	}
	
	public void run() {
		
	}

	public void update(int data) {
		System.out.println("Observer" + id + " get " + data);
	}

}
