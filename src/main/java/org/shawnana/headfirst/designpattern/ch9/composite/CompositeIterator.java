package org.shawnana.headfirst.designpattern.ch9.composite;

import java.util.Iterator;
import java.util.LinkedList;

public class CompositeIterator<MenuComponent> implements Iterator<MenuComponent> {
	private LinkedList<Iterator<MenuComponent>> stack = new LinkedList<Iterator<MenuComponent>>();

	public CompositeIterator(Iterator<MenuComponent> iterator) {
		stack.push(iterator);
	}

	@Override
	public boolean hasNext() {
		if (stack.isEmpty()) {
			return false;
		} else {
			Iterator<MenuComponent> iterator = stack.peek();
			if (iterator.hasNext())
				return true;
			else {
				stack.pop();
				return hasNext();
			}
		}
	}

	@Override
	public MenuComponent next() {
		if (hasNext()) {
			Iterator<MenuComponent> iterator = stack.peek();
			MenuComponent component =  iterator.next();
			if (component instanceof Menu) { // 把子元素压入栈
				stack.push((Iterator<MenuComponent>) ((Menu) component).createIterator());
			}
			return component;
		}
		return null;
	}

	@Override
	public void remove() {
		throw new UnsupportedOperationException();
	}

}
