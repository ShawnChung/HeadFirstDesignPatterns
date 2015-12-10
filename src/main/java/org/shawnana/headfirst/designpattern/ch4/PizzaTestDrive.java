package org.shawnana.headfirst.designpattern.ch4;

import org.shawnana.headfirst.designpattern.ch4.pizzas.Pizza;
import org.shawnana.headfirst.designpattern.ch4.pizzastores.ChicagoPizzaStore;
import org.shawnana.headfirst.designpattern.ch4.pizzastores.NYPizzaStore;
import org.shawnana.headfirst.designpattern.ch4.pizzastores.PizzaStore;

public class PizzaTestDrive {
	public static void main(String[] args) {
		PizzaStore nyPizzaStore = new NYPizzaStore();
		PizzaStore chicagoPizzaStore = new ChicagoPizzaStore();
		
		Pizza pizza = nyPizzaStore.orderPizza("cheese");
		pizza = chicagoPizzaStore.orderPizza("cheese");
	}
}
