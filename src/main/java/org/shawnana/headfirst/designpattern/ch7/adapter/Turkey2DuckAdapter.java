package org.shawnana.headfirst.designpattern.ch7.adapter;

public class Turkey2DuckAdapter implements Duck {
	Turkey turkey;
	
	public Turkey2DuckAdapter(Turkey turkey) {
		this.turkey = turkey;
	}
	
	@Override
	public void quack() {
		turkey.gurgle();
	}

	@Override
	public void fly() {
		for (int i = 0; i < 5; i++)
			turkey.fly();
	}

}
