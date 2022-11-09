package com.mandeep.stacks;

import java.util.Stack;

public class ReverseWord {

	 static String reverseWords(String S)
	    {
	        StringBuilder sb = new StringBuilder();
	        Stack<Character> sc= new Stack<Character>();        
	        for(int i=0;i<S.length();i++){
	            if(S.charAt(i)=='.'){
	                while(!sc.isEmpty()) {
	                	sb.append(sc.pop());
	                }
	            	sb.append('.');
	            }
	            else{
	                sc.push(S.charAt(i));
	            }
	        }  
	        
	        if(!sc.isEmpty()) {
	            while(!sc.isEmpty()) {
                	sb.append(sc.pop());
                }
            
	        }
	    
	        
	        return sb.toString();
	    }
	 
	 public static void main(String[] args) {
		String s="i.like.this.program.very.much";
		String s1= reverseWords(s);
		 System.out.println(s1);
	}
}
