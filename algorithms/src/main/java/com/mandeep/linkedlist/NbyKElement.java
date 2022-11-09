package com.mandeep.linkedlist;

public class NbyKElement {

	

    public static int size(Node head){
        if(head==null){
            return 0;
        }
        
        
        int count=0;
        while(head!=null){
            count++;
            head=head.next;
        }
        
        return count;
    }
    
    
    
    public static Node nthNode(Node head, int n, int i){
	    i=i+1;
        
        if(i==n){
            return head;
        }
    	
	
        head=head.next;	         
    	Node nth= nthNode(head,n,i);
            
        
        return nth;
    }
    
    
    public static int nknode(Node head, int k)
    {
       // add your code here
       int n= size(head);
       Double result = Math.ceil((double) n / k);
       int kth=    result.intValue();
       Node nd = nthNode(head,kth,0);
       return nd.data;   
       
    }
    
    
    public int sum(Node head, int k){
        //write code here
        int n= size(head);
        
        
        int startPoint= n-k;
        int counter=0;
        int sum=0;
        
        while(head!=null){
            
            if(counter>=startPoint){
                sum=head.data;
            }
            
            counter++;
            head=head.next;
        }
        
        
        return sum;
      }
    
   public static Node reverseList(Node node){
        
        Node head=null;
        while(node!=null){
            Node n = new Node(node.data);
            n.next=head;
            head=n;
            node=node.next;
        }
        
        return head;        
        
    }
    
    public static Node addOne(Node head) 
    { 
        //code here.
        
        Node reverseHead = reverseList(head);
        
        
        int sum= reverseHead.data+1;
        int carry=sum/10;
        int value = sum%10;
        reverseHead.data=value;
        if(reverseHead.next==null) {
        	if(carry>0) {
                Node n= new Node(carry);
                carry=0;
                reverseHead.next=n;
                //reverseHead=reverseHead.next;
                return reverseList(reverseHead);
        	}
        }
        
        reverseHead=reverseHead.next;
        
        while(reverseHead!=null){
            sum= head.data+carry;
            carry=sum/10;
            value = sum%10;
            head.data=value;
            if(reverseHead.next==null && carry>0){
              Node n= new Node(carry);
              carry=0;
              reverseHead.next=n;
            }
            else{
            	reverseHead=reverseHead.next;
            }
            
            
        }
        return reverseList(reverseHead);
    }
    
    
    public static Node ListFromString(String data) {
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
		return head;
    }
    
    private static void printList(Node n) {
    	
    	while(n!=null) {
    		System.out.print(n.data+" ");
    		n=n.next;
    	}
    	
    }
    
    public static void main(String[] args) {
    	Node node =  ListFromString("2 7 9 3 5");
	    System.out.println(nknode(node,3));
	    
	    Node node1 =  ListFromString("9");
	    Node added= addOne(node1);
	    printList(added);

	    Node node2 =  ListFromString("99");
	    Node added2= addOne(node2);
	    printList(added2);

    }
}
