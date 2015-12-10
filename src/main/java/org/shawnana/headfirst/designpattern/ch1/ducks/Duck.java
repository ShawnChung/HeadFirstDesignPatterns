package org.shawnana.headfirst.designpattern.ch1.ducks;

import org.shawnana.headfirst.designpattern.ch1.flybehavior.FlyBehavior;
import org.shawnana.headfirst.designpattern.ch1.quackbehavior.QuackBehavior;

public abstract class Duck {
	public void swim() {
		System.out.println("Every Duck can swim.");
	}
	
	public void displsy() {
		System.out.println("Every Duck should show itself.");
	}
	
	public void performFly() {
		this.getFlyBehavior().fly();
	}
	
	public void performQuack() {
		this.getQuackBehavior().quack();
	}
	
	public FlyBehavior getFlyBehavior() {
		return flyBehavior;
	}

	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}

	public QuackBehavior getQuackBehavior() {
		return quackBehavior;
	}

	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}

	private FlyBehavior flyBehavior;
	private QuackBehavior quackBehavior;
}
