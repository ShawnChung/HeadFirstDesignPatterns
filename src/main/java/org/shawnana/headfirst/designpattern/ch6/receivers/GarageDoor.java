package org.shawnana.headfirst.designpattern.ch6.receivers;

public class GarageDoor {
	String name;
	public GarageDoor(String name) {
		this.name = name;
	}

	public void open() {
		System.out.println("GarageDoor is open");
	}

	public void close() {
		System.out.println("GarageDoor is close");
	}

}
