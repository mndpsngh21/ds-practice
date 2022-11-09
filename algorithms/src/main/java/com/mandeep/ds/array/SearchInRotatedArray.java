package com.mandeep.ds.array;

public class SearchInRotatedArray {

	public static void main(String[] args) {
		int[] a= {5,6,7,8,9,10,1,2,3};
		int key=10;
		search(a, 0, 8, key);
		
	}
	
	static int search(int A[], int l, int h,int key) {
		while(l<h) {
			if(A[l]<=key) {
				if(A[l]==key) {
					return l;
				}
				l++;
			}
			else {
				if(A[h]==key) {
					return h;
				}
				h--;
			}
			
		}
		return -1;
	}
	
}
