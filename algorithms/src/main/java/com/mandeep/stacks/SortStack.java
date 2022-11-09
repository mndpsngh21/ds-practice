package com.mandeep.stacks;

import java.util.Stack;

public class SortStack {

	
	public static void sortStack(Stack<Integer> s){
		Stack<Integer> copy = new Stack<Integer>();
		
		while(!s.isEmpty()) {

			int tmp=s.pop();
			while(!copy.isEmpty() && copy.peek()<tmp) {
				s.push(copy.pop());
			}
			copy.push(tmp);
			
		}
		
		while(!copy.isEmpty()) {
			s.push(copy.pop());
		}				
	}
	
	private static void printStack(Stack<Integer> s) {
		for(Integer value: s) {
			System.out.println(value);
		}
	}
	
	public static void main(String[] args) {
		Stack<Integer> stack = new  Stack<Integer>();
		stack.add(4);
		stack.add(15);
		stack.add(5);
		sortStack(stack);
		printStack(stack);
	}
	
	
}
