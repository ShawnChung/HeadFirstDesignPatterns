package org.shawnana.headfirst.designpattern.ch6.receivers;

public class CeilingFan {
	String name;
	
	public CeilingFan(String name) {
		this.name = name;
	}

	public void on() {
		System.out.println(this.name + " CeilingFan is on");
	}

	public void off() {
		System.out.println(this.name + " CeilingFan is off");
	}

}
