package com.mandeep.stacks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Stack;

public class FindLeafNodes {

	
	 public static int[] leafNodes(int arr[], int N)
	    {
	       ArrayList<Integer> l= new ArrayList();  
		   Stack<Integer> s= new Stack();
		   s.add(0);
		   while(!s.isEmpty()) {
			   
			   int idx=s.pop();
			   int leftChild=2*idx+1;
			   int rigthChild=2*idx+2;

			   if(rigthChild<N) {
				   s.push(rigthChild);
			   }
			   
			   if(leftChild<N) {
				   s.push(leftChild);
			   }
	

	
			   if(leftChild>=N && rigthChild>=N) {
				   l.add(arr[idx]);
			   }
			   
		   }
		   
		  
		   int[] arrV = new int[l.size()];
		   int counter=0;
		   for(Integer i:l) {
			   arrV[counter]=i;
			   counter++;
		   }
		   
		 	return arrV;
	    }
	 
	 
	 public static void main(String[] args) {
		  int[] d= new int[]{2,1};
		  leafNodes(d, d.length);
	}
}
