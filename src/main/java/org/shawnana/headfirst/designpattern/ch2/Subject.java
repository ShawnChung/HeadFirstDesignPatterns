package org.shawnana.headfirst.designpattern.ch2;

public interface Subject {
	boolean registObserver(Observer observer);
	boolean removeObserver(Observer observer);
	void notifyObservers();
}
