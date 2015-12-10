package org.shawnana.headfirst.designpattern.ch1;

import org.shawnana.headfirst.designpattern.ch1.ducks.Duck;
import org.shawnana.headfirst.designpattern.ch1.ducks.MallarDuck;
import org.shawnana.headfirst.designpattern.ch1.flybehavior.FlyBehavior;
import org.shawnana.headfirst.designpattern.ch1.flybehavior.FlyWithWing;
import org.shawnana.headfirst.designpattern.ch1.quackbehavior.Quack;
import org.shawnana.headfirst.designpattern.ch1.quackbehavior.QuackBehavior;

public class MiniDuckSimulator {
	public static void main(String[] args) {
		Duck mallar = new MallarDuck();
		mallar.performFly();
		mallar.performQuack();
		FlyBehavior flyWithWing = new FlyWithWing();
		mallar.setFlyBehavior(flyWithWing);
		QuackBehavior quack = new Quack();
		mallar.setQuackBehavior(quack);
		mallar.performFly();
		mallar.performQuack();
	}
}
