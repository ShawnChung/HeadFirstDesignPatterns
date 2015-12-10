package org.shawnana.headfirst.designpattern.ch2;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class ConcreteSubject implements Subject, Runnable {
	private List<Observer> observers = null;
	private int data;
	
	public ConcreteSubject() {
		this.observers = new ArrayList<Observer>();
	}
	
	public boolean registObserver(Observer observer) {
		return this.observers.add(observer);
	}

	public boolean removeObserver(Observer observer) {
		return this.observers.remove(observer);
	}

	public void notifyObservers() {
		for (Observer observer : observers) {
			observer.update(data);
		}
	}

	public void run() {
		Random rand = new Random(47);
		while (!Thread.currentThread().isInterrupted()) {
			data = rand.nextInt(100);
			if (data % 2 == 0)
				notifyObservers();
			try {
				TimeUnit.SECONDS.sleep(2 + (data % 2));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) throws InterruptedException {
		ConcreteSubject subject = new ConcreteSubject();
		Observer observer1 = new ConcreteObserver(subject);
		Observer observer2 = new ConcreteObserver(subject);
		Observer observer3 = new ConcreteObserver(subject);
		Thread t = new Thread(subject);
		t.start();
		TimeUnit.SECONDS.sleep(10);
		t.interrupt();
	}

}
