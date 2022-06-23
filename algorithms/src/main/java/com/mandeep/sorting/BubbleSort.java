package com.mandeep.sorting;

public class BubbleSort {

	

	private static void printArray(int[] array) {
		for(int i=0 ;i<array.length;i++) {
		 System.out.print(array[i]+" ");
		}
		System.out.println("");
	}
	
	/**
	 * Simple logic : move biggest number in last position
	 * @param input
	 * @return
	 */
	public static int[] sort(int[] input) {
		
		for(int i=0 ;i<input.length-1;i++) {
			for( int j=1; j<input.length-i;j++) {
				if(input[j-1]>input[j]) {
					int temp=input[j-1];
					input[j-1]=input[j];
					input[j]=temp;
					
				}
			}
			printArray(input);
		}
		
		
		
		
		return input;
	}
	
	public static void main(String[] args) {
		int[] array = {6,4,8,10,12,1,3,6,7,5,7,1,5,5,15,19,36,29,48,95,28};
		sort(array);
	}
	
	
	
}
