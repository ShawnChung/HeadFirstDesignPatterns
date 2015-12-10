package org.shawnana.headfirst.designpattern.ch4.pizzas;

import org.shawnana.headfirst.designpattern.ch4.ingredientfactory.PizzaIngredientFactory;

public class CheesePizza extends Pizza {
	private PizzaIngredientFactory ingredientFactory;
	
	public CheesePizza(PizzaIngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	}
	
	@Override
	public void cut() {
		System.out.println("Cutting the pizza into square slices");
	}

	@Override
	public void prepare() {
		System.out.println("Preparing " + this.name);
		this.cheese = this.ingredientFactory.createCheese();
		this.clam = this.ingredientFactory.createClam();
		this.dough = this.ingredientFactory.createDough();
		this.pepperoni = this.ingredientFactory.createPepperoni();
		this.sauce = this.ingredientFactory.createSauce();
		this.veggies = this.ingredientFactory.createVeggies();
	}
}
