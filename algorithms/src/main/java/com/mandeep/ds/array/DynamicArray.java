package com.mandeep.ds.array;

public class DynamicArray<T> {
	private int len = 0; // length user thinks array is
	private int capacity = 0; // Actual array size

	T[] array = null;

	public DynamicArray() {
		this(16);
	}

	public DynamicArray(int capacity) {
		if (capacity < 0)
			throw new IllegalArgumentException("Illegal Capacity: " + capacity);
		this.capacity = capacity;
		array = (T[]) new Object[capacity];
	}

	public int size() {
		return len;
	}

	public boolean isEmpty() {
		return size() == 0;
	}
	
	

}
