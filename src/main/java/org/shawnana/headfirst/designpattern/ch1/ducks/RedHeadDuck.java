package org.shawnana.headfirst.designpattern.ch1.ducks;

import org.shawnana.headfirst.designpattern.ch1.flybehavior.FlyWithWing;
import org.shawnana.headfirst.designpattern.ch1.quackbehavior.Quack;

public class RedHeadDuck extends Duck {
	public RedHeadDuck() {
		this.setFlyBehavior(new FlyWithWing());
		this.setQuackBehavior(new Quack());
	}
	
	public void display() {
		System.out.println("This is a RedHeadDuck.");
	}
}
