package org.shawnana.headfirst.designpattern.ch3;

public abstract class Beverage {
	String description = "Unknown Baverage";
	
	public String getDescription() {
		return this.description;
	}
	
	public abstract double cost();
}
