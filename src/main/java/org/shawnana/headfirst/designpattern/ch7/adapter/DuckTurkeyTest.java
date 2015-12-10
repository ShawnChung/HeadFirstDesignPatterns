package org.shawnana.headfirst.designpattern.ch7.adapter;

public class DuckTurkeyTest {
	public static void main(String[] args) {
		Turkey wildTurkey = new WildTurkey();
		Turkey2DuckAdapter adapter = new Turkey2DuckAdapter(wildTurkey);
		testDuck(adapter);
	}
	
	public static void testDuck(Duck duck) {
		duck.quack();
		duck.fly();
	}
}
