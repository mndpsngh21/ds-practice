package com.mandeep.array;

import static org.junit.Assert.*;

import org.junit.Test;

import com.mandeep.array.LinkedList.CustException;

public class LinkedListTest {

	@Test
	public void testAdd() throws CustException {
		LinkedList linkedList = new LinkedList();
		  for( int i=1 ; i<=10;i++) {
				linkedList.add(i);
		  }
		  linkedList.printList();
		 assertEquals(10, linkedList.size()); 
		 
		 assertEquals(3, linkedList.getValue(2));

		 linkedList.removeFirst();
		 
		 assertEquals(2, linkedList.getFirst());
		 assertEquals(9, linkedList.size());
		 
		 
		 linkedList.remove(5);
		 assertEquals(8, linkedList.getValue(5));
		 linkedList.removeLast();
		 assertEquals(9, linkedList.getLast());

	}

}
