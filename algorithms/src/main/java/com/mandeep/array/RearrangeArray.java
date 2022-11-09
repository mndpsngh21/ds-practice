package com.mandeep.array;

import java.util.ArrayList;

public class RearrangeArray {


    public static void main(String[] args) {
      
        long [] arr = new long[]{-3, 3, -2, 2};
        reArrange(arr, arr.length);
        print(arr);
        
    }

    public static void swap(int[] arr ,int from, int to){
        int temp= arr[to];
        arr[to]=arr[from];
        arr[from]=temp;
    }

    public static void print(long[] arr){

        for(int i=0;i<arr.length;i++){
         System.out.print(arr[i]+" ");
        } 

        System.out.println();

 }

    public static void reArrange(long[] arr, int n){


        ArrayList<Long> list = new ArrayList<Long>();
        
        for(int i=0;i<n;i++){
            if(arr[i]>=0){
                list.add(arr[i]);
            }
        }
        
        int k=0;
        
        for(int i=0;i<n;i++){
        
            if(arr[i]<0){
                arr[k++]=arr[i];
            }
            
        }
        
        for(int j=0;j<list.size();j++){
            arr[k++]=list.get(j);
        }
        
    }
    
}
