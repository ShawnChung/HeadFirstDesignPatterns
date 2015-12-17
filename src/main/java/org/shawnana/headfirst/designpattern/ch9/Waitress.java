package org.shawnana.headfirst.designpattern.ch9;

import java.util.Iterator;

import org.shawnana.headfirst.designpattern.ch9.composite.MenuComponent;

public class Waitress {
	MenuComponent allMenus;

	public Waitress(MenuComponent all) {
		this.allMenus = all;
	}

	public void printMenu() {
		this.allMenus.print();
	}

	public void printVegetarianMenu() {
		Iterator<MenuComponent> iterator = allMenus.createIterator();
		System.out.println("\nVEGETARIAN MENU\n----");
		while (iterator.hasNext()) {
			MenuComponent menuComponent = (MenuComponent) iterator.next();
			try {
				if (menuComponent.isVegetarian()) {
					menuComponent.print();
				}
			} catch (UnsupportedOperationException e) {
			}
		}
	}
}
