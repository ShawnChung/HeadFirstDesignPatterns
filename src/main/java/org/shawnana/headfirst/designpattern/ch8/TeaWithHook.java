package org.shawnana.headfirst.designpattern.ch8;

public class TeaWithHook extends CaffeineBeverageWithHook {

	@Override
	void brew() {
		System.out.println("Steeping the tea");
	}

	@Override
	void addComdiments() {
		System.out.println("Adding leamon");
	}

}
