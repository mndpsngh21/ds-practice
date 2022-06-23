package com.mandeep.recurssion;

public class StringOperations {

	public static void reverseString(String str,String newStr, int index) {
		if(index<1) { // base function
			System.out.println(newStr);
			return;
		}
		newStr = newStr+str.charAt(index-1);
		reverseString(str, newStr, index-1);
	}
	
	
	
	
	public static void main(String[] args) {
		String s="mandeep";
		reverseString(s,"", s.length());
		
	}
}
