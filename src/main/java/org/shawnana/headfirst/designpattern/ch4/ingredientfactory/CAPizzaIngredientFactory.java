package org.shawnana.headfirst.designpattern.ch4.ingredientfactory;

import org.shawnana.headfirst.designpattern.ch4.ingredients.cheese.Cheese;
import org.shawnana.headfirst.designpattern.ch4.ingredients.clam.Clam;
import org.shawnana.headfirst.designpattern.ch4.ingredients.dough.Dough;
import org.shawnana.headfirst.designpattern.ch4.ingredients.pepperoni.Pepperoni;
import org.shawnana.headfirst.designpattern.ch4.ingredients.sauce.Sauce;
import org.shawnana.headfirst.designpattern.ch4.ingredients.veggies.Veggies;

public class CAPizzaIngredientFactory implements PizzaIngredientFactory {
	private static volatile CAPizzaIngredientFactory instance;
	private CAPizzaIngredientFactory() {
		
	}
	
	public static synchronized CAPizzaIngredientFactory getInstance() {
		if (instance == null)
			instance = new CAPizzaIngredientFactory();
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
