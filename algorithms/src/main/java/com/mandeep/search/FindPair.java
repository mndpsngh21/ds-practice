package com.mandeep.search;

import java.util.Arrays;

public class FindPair {

    public static void main(String[] args) {
       int arr[] = {5, 20, 3, 2, 5, 80};
       boolean result= findPair(arr, arr.length, 78);
       System.out.println(result);
    }

    public static boolean findPair(int arr[], int size, int n)
    {
        

        //code here.
        Arrays.sort(arr);
        
        for(int i=0;i<=arr.length-1;i++){
            int diff= Math.abs(arr[i]-n);
            int idx = binarySearch(diff,arr);
            if(idx>=0){
                return true;
            }
        }
        return false;
    }
    
      public static int binarySearch(int value, int arr[]){
        int s = 0;
        int e = arr.length-1;
        while(s<=e){
            int mid= s+(e-s)/2;
            if(arr[mid]==value){
                return mid;
            }

            else if(arr[mid]<value){
                s=mid+1;
            }
            else{
                e=mid-1;
            }
        }
        return -1;
    }
    
}
