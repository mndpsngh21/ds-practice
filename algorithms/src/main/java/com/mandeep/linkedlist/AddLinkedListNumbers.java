package com.mandeep.linkedlist;

public class AddLinkedListNumbers {
	
	
	
	public static void main(String[] args) {
		String data="2 9 1 2 9 9 2 8 2";
		String data2="2 8 9";
		Node first = LinkedListUtils.createLinkedList(data.split(" "));
		Node second = LinkedListUtils.createLinkedList(data2.split(" "));
		
		Node r= addTwoLists(first, second);
		
		while(r!=null) {
			System.out.print(r.data+" ");
			r=r.next;
		}
		
	}
	
	static Node addTwoLists(Node first, Node second){
        Node one=   reverseList(first);   
        Node two=   reverseList(second);   
        
        
        int sum= one.data+two.data;
        int value=sum%10;
        int carry= (int)sum/10;

        Node pointer= new Node(value); 
        Node head=pointer;
        
        one=one.next;
        two=two.next;
        
        while(one!=null&& two!=null){
             
             sum= one.data+two.data+carry;
             value=sum%10;
             carry= (int)sum/10;
             Node node= new Node(value); 
             pointer.next=node;
             pointer=node;
               one=one.next;
             two=two.next;
        }
        
        
        
        if(one!=null){
            while(one!=null){
            	 sum= one.data+carry;
                 value=sum%10;
                 carry= (int)sum/10;
                 Node node= new Node(value); 
                 pointer.next=node;
                 pointer=node;
                 one=one.next;
            }
            
        }
        
        
         if(two!=null){
            while(two!=null){
            	
            	 sum= two.data+carry;
                 value=sum%10;
                 carry= (int)sum/10;
                 Node node= new Node(value); 
                 pointer.next=node;
                 pointer=node;
                 two=two.next;
            }
            
        }
        
         if(carry>0) {
        	  Node node= new Node(carry); 
              pointer.next=node;
              pointer=node;
         }
        
        return reverseList(head);
    }
    
  
    static Node reverseList(Node head){
        
       Node prev= null;
        Node current =head;
        Node next= head.next;
        
        while(current !=null){
            
            current.next=prev;
            prev=current;
            current=next;
            if(current!=null){
            next=current.next;
            }
        }
        
        return prev;   
    }
    

}
