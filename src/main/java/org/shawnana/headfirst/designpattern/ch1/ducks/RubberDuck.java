package org.shawnana.headfirst.designpattern.ch1.ducks;

import org.shawnana.headfirst.designpattern.ch1.flybehavior.FlyNoWing;
import org.shawnana.headfirst.designpattern.ch1.quackbehavior.MuteQuack;

public class RubberDuck extends Duck {
	public RubberDuck() {
		this.setFlyBehavior(new FlyNoWing());
		this.setQuackBehavior(new MuteQuack());
	}
	
	public void display() {
		System.out.println("This is a RubberDuck.");
	}
}
