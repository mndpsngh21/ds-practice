package com.mandeep.linkedlist;

public class LinkedListUtils {

	
	public static Node createLinkedList(String[] entries) {
		Node head=null;
		Node tail=null;
		for( int i=0;i<entries.length;i++) {
			if(head==null) {
				head= new Node(Integer.parseInt(entries[i]));
				tail=head;
			}
			else {
				Node node =new Node(Integer.parseInt(entries[i]));
				tail.next=node;
				tail=node;
			}
		}
		return head;
	}
	
}
