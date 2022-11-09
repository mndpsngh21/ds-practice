package com.mandeep.array;

import java.util.ArrayList;

public class FirstAndLastOccurence {
    
    static long findFirstOccurence(long arr[], int l, int r, int x){
        
        long firstOccurence=-1;

        int start=l;
        int end=r;

        while(start<end){
            int mid = start + (end-start)/2;

            if(arr[mid]==x){
                firstOccurence=mid;
                end=mid-1;
            }
            else{
                if(arr[mid]>x){
                    end = mid-1;
                }
                else{
                    start =mid+1;
                }
            }
        }
        return firstOccurence;
    }


    static long findLastOccurence(long arr[], int l, int r, int x){
        
        long firstOccurence=-1;

        int start=l;
        int end=r;

        while(start<end){
            int mid = start + (end-start)/2;

            if(arr[mid]==x){
                firstOccurence=mid;
                start=mid+1;
            }
            else{
                if(arr[mid]>x){
                    end = mid-1;
                }
                else{
                    start =mid+1;
                }
            }
        }
        return firstOccurence;
    }
    
    static ArrayList<Long> find(long arr[], int n, int x)
    {

        ArrayList<Long> result = new ArrayList<Long>();
        long firstOccurence= findFirstOccurence(arr, 0, n, x);
        long lastOccurence= findLastOccurence(arr, 0, n, x);
        result.add(firstOccurence);
        result.add(lastOccurence);
        return result;
    }
   


    public static void main(String[] args) {
      long[] arr = new long[]{1, 1 ,1 ,2 ,3 ,3 ,3 ,4 ,4 ,4 ,4 ,4 ,5 ,5 ,6, 7, 7, 7, 8, 8 ,8 ,8 ,9 ,9 ,9 ,9 ,9 ,10 ,10 ,10};
      find(arr, arr.length, 10);

    }
}
