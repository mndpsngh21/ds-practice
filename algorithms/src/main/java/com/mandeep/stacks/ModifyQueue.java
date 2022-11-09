package com.mandeep.stacks;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class ModifyQueue {
	
	 public Queue<Integer> modifyQueue(Queue<Integer> q, int k) {
	        // add code here.
	        Stack<Integer> s= new Stack<Integer>();
	        Queue<Integer>  queue = new LinkedList<Integer> ();
	        
	        for(int i=0;i<k;i++) {
	        	s.push(q.poll());
	        }

	        while(!s.isEmpty()) {
	        	 queue.add(s.pop());
	        }
	        
	        while(!q.isEmpty()){
	            queue.add(q.poll());
	        }

	        return queue;
	    }
	 

}
