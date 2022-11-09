package com.mandeep.search;

public class BinarySearch {

	public static void main(String[] args) {
		int[] arr = { 2, 3, 4, 5, 6, 7, 8 };
		int low = 0;
		int high = arr.length - 1;
		int mid = low + high / 2;
		int index= binarySearch(arr, low, high, 1);
		System.out.println(index);
	}

	public static int binarySearch(int arr[], int low, int high, int value) {
		if(arr[low]>value) {
			return -1;
		}
		
		int mid = (low + high) / 2;
		if (low > high) {
			return -1;
		} else {
			if (arr[mid] == value) {
				System.out.println("found value " + value);
				return mid;
			}

			if (arr[mid] > value) {
			  return	binarySearch(arr, low, mid, value);
			} else {
			  return 	binarySearch(arr, mid + 1, high, value);
			}
		}
	}

}
