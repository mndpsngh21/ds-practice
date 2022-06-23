package com.mandeep.ds.array;

/**
 * 
 * @author mandeep Static array operations
 *
 * @param <T>
 */
public class Array<T> {

	T[] array = null;
	int capacity = 16;

	@SuppressWarnings("unchecked")
	public Array(int size) {
		this.capacity = size;
		array = (T[]) new Object[size];
	}

	public void addElement(T element, int position) {
		if (position > array.length) {
			throw new RuntimeException("Index out of bound");
		}
		array[position] = element;
	}

	public T getElement(int position) {
		if (position > array.length) {
			throw new RuntimeException("Index out of bound");
		}
		return array[position];
	}

	public void remove(int position) {
		if (position > array.length) {
			throw new RuntimeException("Index out of bound");
		}
		array[position] = null;
	}

	public void clear() {
		for (int i = 0; i < array.length; i++) {
			remove(i);
		}
	}

	public int size() {
		return capacity;
	}
	
}
