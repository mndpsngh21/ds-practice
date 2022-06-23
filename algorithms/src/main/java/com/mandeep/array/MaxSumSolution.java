package com.mandeep.array;

//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

public class MaxSumSolution {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MaxSolution obj = new MaxSolution();

		int n = 10;
		int s = 15;
		n = 5;
		s = 12;
		int[] array2 = { 1, 2, 3, -2, 5 };
		long maxValue = obj.maxSubarraySum(array2, n);
		System.out.println(maxValue);
		int[] array = { -1,-2,-3,-4};
		maxValue = obj.maxSubarraySum(array, array.length);

		System.out.println(maxValue);
	}

}

class MaxSolution {
	long maxSubarraySum(int arr[], int n) {
		// Your code here
		long maxSum = Long.MIN_VALUE;
		for (int i = 0; i < n; i++) {
			int sum = arr[i];
			if (sum > maxSum) {
				maxSum = sum;
			}
			for (int j = i+1; j < n; j++) {
				sum += arr[j];
				if (sum > maxSum) {
					maxSum = sum;
				}
			}
		}
		return maxSum;
	}

}