package com.mandeep.search;

import java.util.*;

public class FindFirstAndLastOccurence {
    public  static ArrayList<Integer> firstAndLast(int arr[], int n, int x){
        // Code here
         int idx = binarySearch(x,arr);
         ArrayList<Integer> idxOccrences= new ArrayList<Integer>();
         if(idx<0){
             return idxOccrences;
         }
         System.out.println(idx);
         int fidx= firstOccurence(arr, x, idx);
         int lidx = lastOccurence(arr, x, idx);

         idxOccrences.add(fidx);
         idxOccrences.add(lidx);
       //  System.out.println(fidx+" "+lidx);
         return idxOccrences;   
        
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

    public static int firstOccurence(int arr[],int val, int fidx){
        if(fidx<=0){
            return fidx;
        }
        
        int idx=fidx;
         while(arr[idx-1]==val && idx>0){
            idx=idx-1;
         }
        return idx;
    }

    public static int lastOccurence(int arr[],int val, int fidx){
        int idx=fidx;
         while(idx<arr.length-1 && arr[idx+1]==val){
            idx++;
         }
        return idx;
    }
    public static void main(String[] args) {
        int[] arr ={0, 0, 0, 0 ,1 ,1 ,1 ,1};
        int val=3;    
        firstAndLast(arr, arr.length, val);

    }




}
