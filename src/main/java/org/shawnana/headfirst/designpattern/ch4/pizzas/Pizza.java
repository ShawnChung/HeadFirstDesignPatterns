package org.shawnana.headfirst.designpattern.ch4.pizzas;

import org.shawnana.headfirst.designpattern.ch4.ingredients.cheese.Cheese;
import org.shawnana.headfirst.designpattern.ch4.ingredients.clam.Clam;
import org.shawnana.headfirst.designpattern.ch4.ingredients.dough.Dough;
import org.shawnana.headfirst.designpattern.ch4.ingredients.pepperoni.Pepperoni;
import org.shawnana.headfirst.designpattern.ch4.ingredients.sauce.Sauce;
import org.shawnana.headfirst.designpattern.ch4.ingredients.veggies.Veggies;

public abstract class Pizza {
	protected String name;
	protected Dough dough;
	protected Sauce sauce;
	protected Veggies[] veggies;
	protected Cheese cheese;
	protected Pepperoni pepperoni;
	protected Clam clam;
	
	
	public abstract void prepare();

	public void bake() {
		System.out.println("Bake for 25 minutes.");
	}

	public void cut() {
		System.out.println("Cutting the pizza into diagonal slices");
	}

	public void box() {
		System.out.println("Place pizza in offical PizzaStore box");
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}
