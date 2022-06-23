package com.mandeep.sorting;

public class InsetionSort {
	public static void main(String[] args) {
		int[] array = {6,4,8,10,12,1,3,7,5,15,19,36,29,48,95,28};
		insertionSort(array);		
	}
	

	/**
	 *  simple logic : move lowest to forward location based on order
	 * 
	 * @param array
	 */
	private static void insertionSort(int[] array) {
		for(int i=1; i<array.length;i++) {
			int current =array[i];
			int j=i-1;

			/**
			 *   keep replacing smaller values till, we have lesser values
			 */
			while(j>=0 && current <array[j]) {
				array[j+1]=array[j];
				j--;
			}
			array[j+1]=current;
			printArray(array, j+1);
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
