package org.shawnana.headfirst.designpattern.ch4.pizzas;

import org.shawnana.headfirst.designpattern.ch4.ingredientfactory.PizzaIngredientFactory;

public class ClamPizza extends Pizza {
	private PizzaIngredientFactory ingredientFactory;
	
	public ClamPizza(PizzaIngredientFactory ingredientFactory) {
		this.ingredientFactory = ingredientFactory;
	}

	@Override
	public void prepare() {
		// 原料统一供应，各种pizza使用的原料风格可以不一致，通过原料工厂进行控制
		System.out.println("Preparing " + this.name);
		this.cheese = this.ingredientFactory.createCheese();
		this.clam = this.ingredientFactory.createClam();
		this.dough = this.ingredientFactory.createDough();
		this.pepperoni = this.ingredientFactory.createPepperoni();
		this.sauce = this.ingredientFactory.createSauce();
		this.veggies = this.ingredientFactory.createVeggies();
	}
}
