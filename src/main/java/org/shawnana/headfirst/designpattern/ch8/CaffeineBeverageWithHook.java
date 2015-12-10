package org.shawnana.headfirst.designpattern.ch8;

public abstract class CaffeineBeverageWithHook {
	final void prepareRecipe() {
		boilWater();
		brew();
		pourInCup();
		if (customerWantsCondiments()) {
			addComdiments();
		}
	}

	private void boilWater() {
		System.out.println("Boiling Water");
	}

	private void pourInCup() {
		System.out.println("Pouring into cup");
	}

	abstract void brew();
	
	abstract void addComdiments();

	public boolean customerWantsCondiments() {
		return true;
	}
}
