package com.mandeep.ds.array;

import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class KthSmallest {

	class MinHeapComparator implements Comparator<Integer> {

		@Override
		public int compare(Integer number1, Integer number2) {
			int value = number1.compareTo(number2);
			if (value < 0) {
				return -1;
			} else if (value > 0) {
				return 1;
			} else {
				return 0;
			}
		}
	}

	public static int kthSmallest(int[] arr, int l, int r, int k) {
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>(Collections.reverseOrder());
		for (int i = 0; i <r; i++) {
			if (queue.size() == k) {
				int value = queue.peek();
				int indexValue=arr[i];
				if (value > indexValue) {
					queue.poll();
					queue.add(indexValue);
				}

			} else {
				queue.add(arr[i]);
			}
		}

		return queue.peek();

	}

	public static void main(String[] args) {
		int arr[] = { 7, 10, 4,  20, 15 };
		int l = 0;
		int n = arr.length;
		int k = 4;

		int index = kthSmallest(arr, l, n, k);
		System.out.println(index);
	}
}
