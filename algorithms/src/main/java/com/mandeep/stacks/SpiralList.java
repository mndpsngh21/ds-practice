package com.mandeep.stacks;

import java.util.ArrayList;
import java.util.Stack;

public class SpiralList {

	
	 ArrayList<Integer> findSpiral(Node root) 
	    {
	 	        // Your code here
		            
		            boolean isFlipped=false;
		            Stack<Node> s = new Stack<Node>();
		            s.push(root);
		            ArrayList<Integer> arr= new ArrayList<Integer>();
		            while(!s.isEmpty()){
		                Node n=s.pop();
		                arr.add(n.data);
		                if(isFlipped){
		                   Node left= n.left;
		                   Node right= n.right;
		                   isFlipped=false;
		                   if(left!=null){
	   	                    s.push(left);      
		                   }

		                   if(right!=null){
		                    s.push(right);   
		                   }
		                }
		                else{
		                   Node left= n.left;
		                   Node right= n.right;
		                   isFlipped=true;
		               	   if(right!=null){
		                    s.push(right);   
		                   }    
		               	   if(left!=null){
	   	                    s.push(left);      
		                   }   
		                }
		                            
		            }
		            
		            return arr;

	    }
	  
	  
	  public static void main(String[] args) {
		Node n = new Node(1);
		Node left = new Node(3);
		Node right = new Node(2);
		
		n.left=left;
		n.right=right;
		
		new SpiralList().findSpiral(n);
		  
		  
	}
	  
	  
}
