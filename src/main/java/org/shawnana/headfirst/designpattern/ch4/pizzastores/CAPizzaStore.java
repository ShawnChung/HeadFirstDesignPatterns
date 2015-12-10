package org.shawnana.headfirst.designpattern.ch4.pizzastores;

import org.shawnana.headfirst.designpattern.ch4.ingredientfactory.CAPizzaIngredientFactory;
import org.shawnana.headfirst.designpattern.ch4.ingredientfactory.PizzaIngredientFactory;
import org.shawnana.headfirst.designpattern.ch4.pizzas.CheesePizza;
import org.shawnana.headfirst.designpattern.ch4.pizzas.ClamPizza;
import org.shawnana.headfirst.designpattern.ch4.pizzas.PepperoniPizza;
import org.shawnana.headfirst.designpattern.ch4.pizzas.Pizza;
import org.shawnana.headfirst.designpattern.ch4.pizzas.VeggiePizza;

public class CAPizzaStore extends PizzaStore {
	private PizzaIngredientFactory ingredientFactory = CAPizzaIngredientFactory.getInstance();
	
	@Override
	Pizza createPizza(String type) {
		Pizza pizza = null;
		if (type.equals("cheese")) {
			pizza = new CheesePizza(ingredientFactory);
			pizza.setName("CA Style Cheese Pizza");
		} else if (type.equals("veggie")) {
			pizza = new VeggiePizza(ingredientFactory);
			pizza.setName("CA Style Veggie Pizza");
		} else if (type.equals("clam")) {
			pizza = new ClamPizza(ingredientFactory);
			pizza.setName("CA Style Clam Pizza");
		} else if (type.equals("pepperoni")) {
			pizza = new PepperoniPizza(ingredientFactory);
			pizza.setName("CA Style Pepperoni Pizza");
		}
		return pizza;
	}

}
