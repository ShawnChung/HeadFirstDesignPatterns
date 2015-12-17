package org.shawnana.headfirst.designpattern.ch9.composite;

import java.util.Iterator;

public class MenuItem extends MenuComponent {
	private String name;
	private String description;
	private boolean vegetatian;
	private double price;
	
	public MenuItem(String name, String desc, boolean ve, double p) {
		this.name = name;
		this.description = desc;
		this.vegetatian = ve;
		this.price = p;
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getDescription() {
		return this.description;
	}
	
	public double getPrice() {
		return this.price;
	}
	
	public boolean isVegetarian() {
		return this.vegetatian;
	}
	
	public void print() {
		System.out.print("    " + this.getName());
		if (isVegetarian())
			System.out.print("(v)");
		System.out.print(", " + this.getPrice());
		System.out.println("    -- " + this.getDescription());
	}
	
	public Iterator<MenuComponent> createIterator() {
		return new NullIterator<MenuComponent>();
	}
}
