package com.mandeep.array;

//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;

public class ArraySolution{
	public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
     Solution obj = new Solution();
     
     int n=10;
     int s=15;
     int[] array = {1,2,3,4,5,6,7,8,9,10};
     ArrayList<Integer> subArray= obj.subarraySum2(array, n, s);

      n=5;
      s=12;
      int[] array2 = {1,2,3,7,5};
      ArrayList<Integer> subArray2= obj.subarraySum2(array, n, s);

     
 }

}

class Solution
{
	 //Function to find a continuous sub-array which adds up to a given number.
    static ArrayList<Integer> subarraySum(int[] arr, int n, int s) 
    {
     ArrayList<Integer> indexArray = new ArrayList<Integer>();
     for(int i=0 ;i<n;i++){
         int sum=arr[i];
                     if(sum==s){
                indexArray.add(i+1);
                indexArray.add(i+1);
                return indexArray;
                         
                     }
         
         for(int j=i+1;j<n;j++){
             sum+=arr[j];
             if(sum>s){
                 break;
             }
             if(sum==s){
                indexArray.add(i+1);
                indexArray.add(j+1);
                return indexArray;
             }
         }
     }
          indexArray.add(-1);
   return indexArray;
    }
    
    
    static ArrayList<Integer> subarraySum2(int[] arr, int n, int s) 
    {
     ArrayList<Integer> indexArray = new ArrayList<Integer>();
     int l=0,r=0;
     int sum=0;
     while(l<n&&r<n) {
    	 sum+=arr[r];
    	 
    	 if(sum>s) {
    		 sum -=arr[l];
    		 l=l++;
    	 }
    	 
    	 if(sum==s) {
             indexArray.add(l+1);
             indexArray.add(r+1);
             return indexArray;
    	 }
    	 r++;
     }
          indexArray.add(-1);
        return indexArray;
    }
 
}