package com.mandeep.recurssion;

public class FindSum {

	public static void sum(int s, int n) {
		
		if(n==0) // base case
		{
			System.out.println(s);
			return;
		}
		s=s+n;
		sum(s, n-1);
	}
	
	
	
	public static void main(String[] args) {
	
		sum(0, 10);
	}
}
