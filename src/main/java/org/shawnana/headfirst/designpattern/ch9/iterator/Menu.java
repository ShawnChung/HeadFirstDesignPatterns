package org.shawnana.headfirst.designpattern.ch9.iterator;

import java.util.Iterator;

public interface Menu<E> {
	Iterator<E> createIterator();
}
