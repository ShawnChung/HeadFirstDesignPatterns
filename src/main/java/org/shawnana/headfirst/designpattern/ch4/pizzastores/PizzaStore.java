package org.shawnana.headfirst.designpattern.ch4.pizzastores;

import org.shawnana.headfirst.designpattern.ch4.pizzas.Pizza;

public abstract class PizzaStore {
	public final Pizza orderPizza(String type) {
		Pizza pizza = createPizza(type);
		pizza.prepare();
		pizza.bake();
		pizza.cut();
		pizza.box();
		return pizza;
	}
	
	abstract Pizza createPizza(String type);
}