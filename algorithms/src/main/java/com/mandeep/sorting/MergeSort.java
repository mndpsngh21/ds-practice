package com.mandeep.sorting;

public class MergeSort {

	
public static void main(String[] args) {
	int[] array = {6,4,8,10,12,1,3,7,5,15,19,36,29,48,95,28};
    mergeSort(array, 0, array.length);	
}	



private static void mergeSort(int[] arr, int low, int high) {
	if(low>=high) {
		return ;
	}
	int mid =(low+high)/2;
	

	mergeSort(arr, low, mid);
	mergeSort(arr, mid,high);
	mergeArray(arr,low,mid,high);
	printArray(arr, mid);
}


private static void mergeArray(int[] arr, int low, int mid, int high) {
	int counter=0;
    int leftInc=0;
    int rightInc=0;
    
    int n1 = mid - low + 1;
    int n2 = high - mid;

    int leftArray[] = new int[n1];
    int rightArray[] = new int[n2];

    for (int i = 0; i < n1; i++)
    	leftArray[i] = arr[low + i];
      for (int j = 0; j < n2; j++)
    	  rightArray[j] = arr[mid + 1 + j];
    
    
    while(leftInc<leftArray.length&& rightInc<rightArray.length) {
    	if(leftArray[leftInc]<rightArray[rightInc]) {
    		arr[counter]=leftArray[leftInc];
    		leftInc++;
    		
    	}else {
    		arr[counter]=rightArray[rightInc];
    		rightInc++;
    	}
		counter++;
    }
    
    for(int i=leftInc;i<leftArray.length;i++) {
    	arr[counter]=leftArray[i];
    }
    
    for(int i=rightInc;i<rightArray.length;i++) {
    	arr[counter]=rightArray[i];
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
