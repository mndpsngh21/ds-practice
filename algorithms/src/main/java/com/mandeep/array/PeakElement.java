package com.mandeep.array;

public class PeakElement {



    public static void main(String[] args) {
        int[] arr = new int[]{6 ,1 ,15 ,19 ,9 ,13 ,12 ,6, 7 ,2 ,10 ,4 ,1 ,14 ,11 ,14, 14 ,13};
        peakElement(arr, arr.length);
    }
    

    public static int peakElement(int[] arr,int n)
    {
       //add code here.
       
      
        int peakIndex=0;
       
       
       for(int i=arr.length-1;i>0;i--){
           
        if(i==arr.length-1){
            if(arr[i]>arr[i-1]){
                return i;
            }
            
        }
        else{
            
            if(arr[i]>arr[i-1] && arr[i]>arr[i+1]){
                return i;
            }
        }
           
       }
       
       return -1;
    }
}
