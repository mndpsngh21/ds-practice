package com.mandeep.heap;

public class HeapSort {

	public void heapify(int arr[], int N, int i) {
	     int largest = i; // Initialize largest as root
	        int l = 2 * i + 1; // left = 2*i + 1
	        int r = 2 * i + 2; // right = 2*i + 2
	 
		if(l<N &&  arr[largest]<arr[l] ) {
			largest=l;
		}
		if(r<N &&   arr[r]>arr[largest]) {
			largest=r;
		}
//		if(largest!=i) {
//			int temp= arr[i];
//			arr[i]=arr[largest];
//			arr[largest]=temp;
//			heapify(arr, N, largest);
//		}
		
		 // If largest is not root
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;
 
            // Recursively heapify the affected sub-tree
            heapify(arr, N, largest);
        }
	}
	

	public void generateMaxHeap(int[] arr) {
		int N = arr.length;
		 
        // Build heap (rearrange array)
        for (int i = N / 2 - 1; i >= 0; i--)
            heapify(arr, N, i);
	}
	
	
	private void swap(int[] arr,int i, int j) {
	  int temp = arr[i];
	  arr[i]=arr[j];
	  arr[j]=temp;
	}


	
	public void printArray(int[] arr) {
		for(int v:arr) {
			System.out.print(v+" ");
		}
		
	}
	
	public void sort(int[] arr) {
		generateMaxHeap(arr);
		int N =arr.length;
		
		for (int i = N - 1; i > 0; i--) {
            // Move current root to end
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
 
            // call max heapify on the reduced heap
            heapify(arr, i, 0);
        }
		//printArray(arr);
		
	}
	
	public static void main(String[] args) {
		HeapSort heapSort = new HeapSort();
		int[] arr= {54,53,55,52,50};
		heapSort.sort(arr);
		heapSort.printArray(arr);
	}
	

}
