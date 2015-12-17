package org.shawnana.headfirst.designpattern.ch9.composite;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Menu extends MenuComponent {
	List<MenuComponent> menuComponents = new ArrayList<MenuComponent>();
	private String name;
	private String description;
	private Iterator<MenuComponent> iterator = null;
	
	public Menu(String name, String desc) {
		this.name = name;
		this.description = desc;
	}

	public String getName() {
		return this.name;
	}
	
	public String getDescription() {
		return this.description;
	}
	
	public void add(MenuComponent menuComponent) {
		this.menuComponents.add(menuComponent);
	}
	
	public void remote(MenuComponent menuComponent) {
		this.menuComponents.remove(menuComponent);
	}
	
	public MenuComponent getChild(int index) {
		return this.menuComponents.get(index);
	}
	
	public void print() {
		System.out.print("\n" + this.getName());
		System.out.println(", " + this.getDescription());
		System.out.println("----------------------------");
		
		Iterator<MenuComponent> iterator = menuComponents.iterator();
		while (iterator.hasNext()) {
			iterator.next().print();
		}
	}
	
	public Iterator<MenuComponent> createIterator() {
		if (iterator == null)
			iterator = new CompositeIterator<MenuComponent>(this.menuComponents.iterator());
		return iterator;
	}
}
