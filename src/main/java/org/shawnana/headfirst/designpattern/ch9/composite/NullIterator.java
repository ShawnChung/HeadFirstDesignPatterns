package org.shawnana.headfirst.designpattern.ch9.composite;

import java.util.Iterator;

public class NullIterator<E> implements Iterator<E> {

	@Override
	public boolean hasNext() {
		return false;
	}

	@Override
	public E next() {
		return null;
	}

	@Override
	public void remove() {
		throw new UnsupportedOperationException();
	}

}
