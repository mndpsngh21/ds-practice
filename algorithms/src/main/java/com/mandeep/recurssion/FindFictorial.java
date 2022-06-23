package com.mandeep.recurssion;

public class FindFictorial {

	
	// find factorial by recursion;
	public static int printFactorial(int n)
	{
		if(n==1 || n==0)
		{
			return 1;
		}
		return n*printFactorial(n-1);
	}
	
	
	// fibonaci sum
	public static int fabSum(int n) {
		if(n<=1) {
			return n;
		}
		return fabSum(n-1)+fabSum(n-2);
	}
	
	
	// print fibonacci series
	public static void printFibSeries(int counter, int maxValue, int sum, int lastSum) {
		
		if(counter>maxValue) {
			return;
		}
		if(sum>0)
		 System.out.print(",");

		System.out.print(sum);
		
		printFibSeries(counter+1, maxValue, lastSum, lastSum+sum);
		
	}
	
	
	public static void main(String[] args) {
		System.out.println(printFactorial(10));
		System.out.println(fabSum(9));
		printFibSeries(0,9, 0,1);
	}
}
