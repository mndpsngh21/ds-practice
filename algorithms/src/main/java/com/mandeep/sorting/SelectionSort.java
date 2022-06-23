package com.mandeep.sorting;

public class SelectionSort {

	public static void main(String[] args) {
		int[] array = {6,4,8,10,12,1,3,7,5,15,19,36,29,48,95,28};
        selectionSort(array);		
	}
	

	/**
	 *  simple logic : move lowest to forward location based on order
	 * 
	 * @param array
	 */
	private static void selectionSort(int[] array) {
		int smallestIndex=0;
		for(int i=0; i<array.length;i++) {
			smallestIndex=i;
			for(int j=i+1;j<array.length;j++) {
			 if(array[smallestIndex]>array[j]) {
				 smallestIndex=j;
			 }
			}
			printArray(array,smallestIndex);
			int temp =array[i];
			array[i]=array[smallestIndex];
			array[smallestIndex]=temp;
		}
	}
	
	private static void printArray(int[] array, int updatedIndex) {
		for(int i=0 ;i<array.length;i++) {
			if(i==updatedIndex) {
				System.out.print("["+array[i]+"] ");
			}
			else {
				System.out.print(array[i]+" ");				
			}
		}
		System.out.println("");
	}
	
	
}
