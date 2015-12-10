package org.shawnana.headfirst.designpattern.ch7.adapter;

public class WildTurkey implements Turkey {

	@Override
	public void gurgle() {
		System.out.println("WildTurkey gurgle");
	}

	@Override
	public void fly() {
		System.out.println("WildTurkey fly");
	}

}
