package com.mandeep.stacks;

import java.util.Stack;

public class SortStackRecursively {

	public static Stack<Integer> sort(Stack<Integer> s)
	{
		removeAndInsert(s);
		return s;
	}
	
	public static void removeAndInsert(Stack<Integer> s) {
		if(s.isEmpty()) {
			return;
		}
		
		int value = s.pop();
		removeAndInsert(s);
		findGreat(s, value);
		
	}
	
	
	public static void findGreat(Stack<Integer> s, Integer minimum){
	    if(s.isEmpty()){
	        s.push(minimum);
	        return;
	    }

         Integer val= s.pop();
         if(val>minimum){
             findGreat(s,minimum);
             s.push(val);
         }	    
         else{
             findGreat(s,val);
             s.push(minimum);
         }
	}
	
	
	private static void printStack(Stack<Integer> s) {
		while(!s.isEmpty()) {
			System.out.println(s.pop());
		}
	}
	
	public static void main(String[] args) {
		Stack<Integer> stack = new  Stack<Integer>();
		stack.add(1);
		stack.add(2);
		stack.add(3);
		Stack<Integer> s= sort(stack);
		printStack(s);
	}
	
	
}
