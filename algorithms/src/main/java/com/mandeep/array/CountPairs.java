package com.mandeep.array;

import java.util.Arrays;

public class CountPairs {

    static int getPairsCount(int[] arr, int n, int k) {
        // code here
        int count=0;
        Arrays.sort(arr);
       
        int l=0;
        int r=arr.length-1;

        while(l<r){

            if(arr[l]+arr[r]>k){
                r--;
            }
            else{
                if(arr[l]+arr[r]==k){
                    count++;
                }
                if(arr[r]==arr[r-1]){
                    r--;
                }
                else{
                    l++;
                }

            }
        }
        
        
        return count;
    }


    public static void main(String[] args) {
        int arr[] = {48, 24, 99 ,51 ,33, 39, 29 ,83 ,74, 72, 22, 46, 40, 51, 67, 37, 78, 76, 26, 28, 76, 25, 10, 65, 64, 47 ,34 ,88 ,26 ,49 ,86 ,73 ,73 ,36 ,75, 5, 26, 4 ,39 ,99 ,27 ,12 ,97 ,67 ,63 ,15 ,3 ,92, 90};

      int count=  getPairsCount(arr, 49, 50);
      System.out.println(count);
     
    }
    
}
