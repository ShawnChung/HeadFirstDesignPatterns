package org.shawnana.headfirst.designpattern.ch4.pizzastores;

import org.shawnana.headfirst.designpattern.ch4.ingredientfactory.ChicagoPizzaIngredientFactory;
import org.shawnana.headfirst.designpattern.ch4.ingredientfactory.PizzaIngredientFactory;
import org.shawnana.headfirst.designpattern.ch4.pizzas.CheesePizza;
import org.shawnana.headfirst.designpattern.ch4.pizzas.ClamPizza;
import org.shawnana.headfirst.designpattern.ch4.pizzas.PepperoniPizza;
import org.shawnana.headfirst.designpattern.ch4.pizzas.Pizza;
import org.shawnana.headfirst.designpattern.ch4.pizzas.VeggiePizza;

public class ChicagoPizzaStore extends PizzaStore {

	private PizzaIngredientFactory ingredientFactory = ChicagoPizzaIngredientFactory.getInstance();
	
	@Override
	Pizza createPizza(String type) {
		Pizza pizza = null;
		if (type.equals("cheese")) {
			pizza = new CheesePizza(ingredientFactory);
			pizza.setName("Chicago Style Cheese Pizza");
		} else if (type.equals("veggie")) {
			pizza = new VeggiePizza(ingredientFactory);
			pizza.setName("Chicago Style Veggie Pizza");
		} else if (type.equals("clam")) {
			pizza = new ClamPizza(ingredientFactory);
			pizza.setName("Chicago Style Clam Pizza");
		} else if (type.equals("pepperoni")) {
			pizza = new PepperoniPizza(ingredientFactory);
			pizza.setName("Chicago Style Pepperoni Pizza");
		}
		return pizza;
	}

}
