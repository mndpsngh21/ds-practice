package com.mandeep.array;

public class LinkedList {
	
	
	Node head;
	Node tail;
	int counter;
	
	// 1
	// 2
	public void add(int value) {
		if(head== null) // list is empty
		{
			head = new Node(value);
			tail= head;
			counter++;
		}else {
			Node node = new Node(value);
			if(tail.next==null) {
				tail.next=node;
				tail=node;
			}
			counter++;			
		}
	}

	
	public int size() {
		return counter;
	}
	
	
	
	
	public int getValue(int index) {
		if(index>counter ) {
			throw new IndexOutOfBoundsException("index is greater than size");
		}
		
		if(index<0 ) {
			throw new IndexOutOfBoundsException("index must be greater or equal than 0");
		}
		
		if(index==0) {
			return head.value;
		}
		
		Node current=head;
		for(int i=1; i<=index;i++) {
			current=current.next;
		}
		return current.value;
	}
	
	public int getFirst() {
		return getValue(0);
	}
	
	public void removeFirst() throws CustException {
		remove(0);
	}
	
	

	public int getLast() {
		return tail.value;
	}
	
	public void removeLast() throws CustException {
		remove(counter-1);
	}
	
	
	
	
	public void remove(int index) throws CustException {
		if(index>counter ) {
			throw new CustException("index is greater than size");
		}
		
		if(index<0 ) {
			throw new CustException("index must be greater or equal than 0");
		}
		
		if(index==0) {
			Node nextNode= head.next;
			head=nextNode;
			counter--;
		}
		
		
		Node node=head;
		for(int i=1;i<counter;i++) {

			if(i==index) {
				//  2 3 4 5 6 7 8 9 
				// 
				if(i<counter-2) {
					Node nextNode= node.next.next;
					node.next=nextNode;
				}
				else {
					node.next=null;
					tail=node;
				}
				counter--;
			}
			else {
				node=node.next;				
			}
		}

		
		
	}
	
	
	void printList() {
		Node node=head;
		while(node!=null) {
			System.out.println(node.value);
			node=node.next;
		}
	}
	
	
	
	
	class Node{
		
		int value;
		Node next;
		
		public Node(int val)
		{
			this.value=val;
		}
		public int getValue() {
			return value;
		}
		public void setValue(int value) {
			this.value = value;
		}
		public Node getNext() {
			return next;
		}
		public void setNext(Node next) {
			this.next = next;
		}
		
		
		
		
	}
	
	class CustException extends Exception{

		public CustException(String string) {
			super(string);
		}
		
	}

}
