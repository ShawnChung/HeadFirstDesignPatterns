package org.shawnana.headfirst.designpattern.ch3;

public class DarkRoast extends Beverage {
	public DarkRoast() {
		this.description = "Dark Roast";
	}
	
	@Override
	public double cost() {
		return .99;
	}

}
