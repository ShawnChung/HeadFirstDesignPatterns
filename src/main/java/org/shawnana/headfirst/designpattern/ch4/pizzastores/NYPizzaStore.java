package org.shawnana.headfirst.designpattern.ch4.pizzastores;

import org.shawnana.headfirst.designpattern.ch4.ingredientfactory.NYPizzaIngredientFactory;
import org.shawnana.headfirst.designpattern.ch4.ingredientfactory.PizzaIngredientFactory;
import org.shawnana.headfirst.designpattern.ch4.pizzas.CheesePizza;
import org.shawnana.headfirst.designpattern.ch4.pizzas.ClamPizza;
import org.shawnana.headfirst.designpattern.ch4.pizzas.PepperoniPizza;
import org.shawnana.headfirst.designpattern.ch4.pizzas.Pizza;
import org.shawnana.headfirst.designpattern.ch4.pizzas.VeggiePizza;

public class NYPizzaStore extends PizzaStore {
	private PizzaIngredientFactory ingredientFactory = NYPizzaIngredientFactory.getInstance();
	
	@Override
	Pizza createPizza(String type) {
		Pizza pizza = null;
		if (type.equals("cheese")) {
			pizza = new CheesePizza(ingredientFactory);
			pizza.setName("New York Style Cheese Pizza");
		} else if (type.equals("veggie")) {
			pizza = new VeggiePizza(ingredientFactory);
			pizza.setName("New York Style Veggie Pizza");
		} else if (type.equals("clam")) {
			pizza = new ClamPizza(ingredientFactory);
			pizza.setName("New York Style Clam Pizza");
		} else if (type.equals("pepperoni")) {
			pizza = new PepperoniPizza(ingredientFactory);
			pizza.setName("New York Style Pepperoni Pizza");
		}
		return pizza;
	}

}
