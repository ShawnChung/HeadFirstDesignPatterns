package org.shawnana.headfirst.designpattern.ch1.ducks;

import org.shawnana.headfirst.designpattern.ch1.flybehavior.FlyNoWing;
import org.shawnana.headfirst.designpattern.ch1.quackbehavior.Squeak;

public class DecoyDuck extends Duck {
	public DecoyDuck() {
		this.setFlyBehavior(new FlyNoWing());
		this.setQuackBehavior(new Squeak());
	}
	
	public void display() {
		System.out.println("This is a DecoyDuck.");
	}
}
