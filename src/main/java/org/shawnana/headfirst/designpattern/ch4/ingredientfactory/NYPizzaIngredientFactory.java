package org.shawnana.headfirst.designpattern.ch4.ingredientfactory;

import org.shawnana.headfirst.designpattern.ch4.ingredients.cheese.Cheese;
import org.shawnana.headfirst.designpattern.ch4.ingredients.cheese.ReggianoCheese;
import org.shawnana.headfirst.designpattern.ch4.ingredients.clam.Clam;
import org.shawnana.headfirst.designpattern.ch4.ingredients.clam.FreshClam;
import org.shawnana.headfirst.designpattern.ch4.ingredients.dough.Dough;
import org.shawnana.headfirst.designpattern.ch4.ingredients.dough.ThinCrustDough;
import org.shawnana.headfirst.designpattern.ch4.ingredients.pepperoni.Pepperoni;
import org.shawnana.headfirst.designpattern.ch4.ingredients.pepperoni.SlicedPepperoni;
import org.shawnana.headfirst.designpattern.ch4.ingredients.sauce.MarinaraSauce;
import org.shawnana.headfirst.designpattern.ch4.ingredients.sauce.Sauce;
import org.shawnana.headfirst.designpattern.ch4.ingredients.veggies.Garlic;
import org.shawnana.headfirst.designpattern.ch4.ingredients.veggies.Mushroom;
import org.shawnana.headfirst.designpattern.ch4.ingredients.veggies.Onion;
import org.shawnana.headfirst.designpattern.ch4.ingredients.veggies.RedPepper;
import org.shawnana.headfirst.designpattern.ch4.ingredients.veggies.Veggies;

public class NYPizzaIngredientFactory implements PizzaIngredientFactory {
	private static volatile NYPizzaIngredientFactory instance;
	
	private NYPizzaIngredientFactory() {}
	
	public static NYPizzaIngredientFactory getInstance() {
		if (instance == null) {
			synchronized(NYPizzaIngredientFactory.class) {
				if (instance == null) {
					instance = new NYPizzaIngredientFactory();
				}
			}
		}
		return instance;
	}
	
	public Dough createDough() {
		return new ThinCrustDough();
	}

	public Sauce createSauce() {
		return new MarinaraSauce(); 
	}

	public Cheese createCheese() {
		return new ReggianoCheese();
	}

	public Pepperoni createPepperoni() {
		return new SlicedPepperoni();
	}

	public Clam createClam() {
		return new FreshClam();
	}

	public Veggies[] createVeggies() {
		return new Veggies[] { new Garlic(), new Onion(), new Mushroom(), new RedPepper()};
	}

}
