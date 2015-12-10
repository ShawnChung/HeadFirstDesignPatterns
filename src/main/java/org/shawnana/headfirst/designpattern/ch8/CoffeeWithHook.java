package org.shawnana.headfirst.designpattern.ch8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CoffeeWithHook extends CaffeineBeverageWithHook {

	@Override
	void brew() {
		System.out.println("Dripping Coffee through filter");
	}

	@Override
	void addComdiments() {
		System.out.println("Adding sugar and milk");
	}

	@Override
	public boolean customerWantsCondiments() {
		String answer = getUserInput();
		if (answer.toLowerCase().startsWith("y")) {
			return true;
		} else {
			return false;
		}
	}

	private String getUserInput() {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Would you like milk and sugar with your coffee? (y/n) ?");
		String result = null;
		try {
			result = in.readLine();
		} catch (IOException e) {
			e.printStackTrace();
		}
		if (result == null)
			return "no";
		return result;
	}
}
