package org.shawnana.headfirst.designpattern.ch4.ingredientfactory;

import org.shawnana.headfirst.designpattern.ch4.ingredients.cheese.Cheese;
import org.shawnana.headfirst.designpattern.ch4.ingredients.clam.Clam;
import org.shawnana.headfirst.designpattern.ch4.ingredients.dough.Dough;
import org.shawnana.headfirst.designpattern.ch4.ingredients.pepperoni.Pepperoni;
import org.shawnana.headfirst.designpattern.ch4.ingredients.sauce.Sauce;
import org.shawnana.headfirst.designpattern.ch4.ingredients.veggies.Veggies;

public class ChicagoPizzaIngredientFactory implements PizzaIngredientFactory {
	private static final ChicagoPizzaIngredientFactory instance = 
			new ChicagoPizzaIngredientFactory();
	
	private ChicagoPizzaIngredientFactory() {}
	
	public static ChicagoPizzaIngredientFactory getInstance() {
		return instance;
	}
	
	public Dough createDough() {
		// TODO Auto-generated method stub
		return null;
	}

	public Sauce createSauce() {
		// TODO Auto-generated method stub
		return null;
	}

	public Cheese createCheese() {
		// TODO Auto-generated method stub
		return null;
	}

	public Veggies[] createVeggies() {
		// TODO Auto-generated method stub
		return null;
	}

	public Pepperoni createPepperoni() {
		// TODO Auto-generated method stub
		return null;
	}

	public Clam createClam() {
		// TODO Auto-generated method stub
		return null;
	}

}
