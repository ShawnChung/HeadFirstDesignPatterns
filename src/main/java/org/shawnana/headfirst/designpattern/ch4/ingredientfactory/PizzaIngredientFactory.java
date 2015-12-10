package org.shawnana.headfirst.designpattern.ch4.ingredientfactory;

import org.shawnana.headfirst.designpattern.ch4.ingredients.cheese.Cheese;
import org.shawnana.headfirst.designpattern.ch4.ingredients.clam.Clam;
import org.shawnana.headfirst.designpattern.ch4.ingredients.dough.Dough;
import org.shawnana.headfirst.designpattern.ch4.ingredients.pepperoni.Pepperoni;
import org.shawnana.headfirst.designpattern.ch4.ingredients.sauce.Sauce;
import org.shawnana.headfirst.designpattern.ch4.ingredients.veggies.Veggies;

public interface PizzaIngredientFactory {
	Dough createDough();
	Sauce createSauce();
	Cheese createCheese();
	Veggies[] createVeggies();
	Pepperoni createPepperoni();
	Clam createClam();
}
