package org.shawnana.headfirst.designpattern.ch9;

import org.shawnana.headfirst.designpattern.ch9.iterator.DinerMenu;
import org.shawnana.headfirst.designpattern.ch9.iterator.PancakeHouseMenu;

public class MenuTestDrive {
	public static void main(String[] args) {
		PancakeHouseMenu pancakeHouseMenu  = new PancakeHouseMenu();
		DinerMenu dinerMenu = new DinerMenu();
		Waitress waitress = new Waitress(pancakeHouseMenu, dinerMenu);
		waitress.printMenu();
	}
}
