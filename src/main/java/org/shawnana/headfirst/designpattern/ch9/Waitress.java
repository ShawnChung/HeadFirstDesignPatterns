package org.shawnana.headfirst.designpattern.ch9;

import java.util.Iterator;

import org.shawnana.headfirst.designpattern.ch9.iterator.DinerMenu;
import org.shawnana.headfirst.designpattern.ch9.iterator.MenuItem;
import org.shawnana.headfirst.designpattern.ch9.iterator.PancakeHouseMenu;

public class Waitress {
	PancakeHouseMenu pancakeHouseMenu;
	DinerMenu dinerMenu;
	
	public Waitress(PancakeHouseMenu pMenu, DinerMenu dMenu) {
		this.pancakeHouseMenu = pMenu;
		this.dinerMenu = dMenu;
	}
	
	public void printMenu() {
		System.out.println("\n-----\nBREAKFAST");
		printMenu(this.pancakeHouseMenu.createIterator());
		System.out.println("\n-----\nDINER");
		printMenu(this.dinerMenu.createIterator());
	}

	private void printMenu(Iterator<MenuItem> iterator) {
		while (iterator.hasNext()) {
			MenuItem menuItem = iterator.next();
			System.out.print(menuItem.getName() + ",");
			System.out.print(menuItem.getPrice() + " -- ");
			System.out.println(menuItem.getDescription());
		}
	}
}
