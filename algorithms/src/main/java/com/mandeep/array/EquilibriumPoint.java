package com.mandeep.array;

public class EquilibriumPoint {
    

    public static void main(String[] args) {
        long[] arr = new long[]{2,4,5,3,3};
        equilibriumPoint(arr, arr.length);
    }


    public static int equilibriumPoint(long arr[], int n) {

        long[] sums= new long[arr.length];

         int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            sums[i]=sum;
       }


       for(int i=1;i<n;i++){
         long prev= sums[i-1];
         long rem = sum-sums[i];
         if(rem==prev){
            return i+1;
         } 
            
       }
        
    
        return -1;
    }

}
