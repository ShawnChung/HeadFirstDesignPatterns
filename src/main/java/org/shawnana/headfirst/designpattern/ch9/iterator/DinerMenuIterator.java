package org.shawnana.headfirst.designpattern.ch9.iterator;

import java.util.Iterator;

public class DinerMenuIterator implements Iterator<MenuItem> {
	private MenuItem[] items;
	private int current = 0;
	
	public DinerMenuIterator(MenuItem[] items) {
		this.items = items;
	}
	
	@Override
	public boolean hasNext() {
		if (current < 0 || current >= items.length || items[current] == null)
			return false;
		return true;
	}

	@Override
	public MenuItem next() {
		if (current < 0 || current >= items.length || items[current] == null)
			throw new ArrayIndexOutOfBoundsException();
		MenuItem result = items[current];
		current++;
		return result;
	}

	@Override
	public void remove() {
		throw new UnsupportedOperationException();
	}

}
