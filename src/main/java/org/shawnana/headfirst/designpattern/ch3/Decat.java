package org.shawnana.headfirst.designpattern.ch3;

public class Decat extends Beverage {
	public Decat() {
		this.description = "Decat";
	}
	
	@Override
	public double cost() {
		return 1.99;
	}

}
