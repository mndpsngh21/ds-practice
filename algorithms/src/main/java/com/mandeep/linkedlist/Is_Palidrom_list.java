package com.mandeep.linkedlist;

public class Is_Palidrom_list {

	
	public static void main(String[] args) {
		
		String data="1 2 3 4 5 6 7 8";
		int rotation=4;
		String[] entries= data.split(" ");
		
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

		rotate(head, rotation);
		
		
	}
	
	 public static Node rotate(Node head, int k) {
	        // add code here
	       if(head==null && head.next==null)
	       {
	           return head;
	       }
	       
	    int counter =k;    
	     Node pointer =head;
	    while(counter>0){ 
	    	head=pointer;
	        Node node = head;
	        head= node.next;
	        pointer = head;
	        node.next=null;
	                
	        while(head.next!=null){
	            head=head.next;
	        }
	        
	        head.next=node;
	        counter--;
	    }
	       
	       return pointer;
	    }
}
