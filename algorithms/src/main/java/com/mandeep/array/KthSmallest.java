package com.mandeep.array;

import java.util.Comparator;
import java.util.PriorityQueue;

public class KthSmallest {

	
	class MinHeapComparator implements Comparator<Integer> {
		 
	    @Override
	    public int compare(Integer number1, Integer number2) {
	        int value = number1.compareTo(number2);
	     
	        // Elements are sorted in reverse order
	        if (value > 0) {
	            return -1;
	        }
	        else if (value < 0) {
	            return 1;
	        }
	        else {
	            return 0;
	        }
	    }
	}
	
	public static void main(String[] args) {
		int[] arr = {7 ,10, 4, 3 ,20 ,15};
		int[] arr1 = {7 ,10, 4 ,20 ,15};
		System.out.println(kthSmallest(arr, 0, arr.length-1, 3));
		System.out.println(kthSmallest(arr1, 0, arr1.length-1, 4));
			
		
		
	}
	
	 public static int kthSmallest(int[] arr, int l, int r, int k) 
	    { 
		 
		 KthSmallest ks= new  KthSmallest();
		 PriorityQueue<Integer> queue = new PriorityQueue<Integer>(ks.new MinHeapComparator());
		 
		 for(int i=0;i<=r;i++) {
			 queue.add(arr[i]);
			 
			 if(queue.size()>k) {
				 queue.poll();
			 }
		 }
		 
		 for(int j=0;j<k-1;j++) {
			 queue.poll();
		 }
		 
		 return queue.peek();
	    } 
	
}
