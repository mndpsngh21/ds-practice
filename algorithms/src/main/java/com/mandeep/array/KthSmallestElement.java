package com.mandeep.array;

public class KthSmallestElement{
    

    public static void swap(int[] arr, int l, int r){
        System.out.println(" Swapping :: "+arr[l]+"  <==> "+arr[r]);
        int temp= arr[l];
        arr[l]=arr[r];
        arr[r]=temp;
        
        
    }

    public static int partition (int[] arr, int l, int r){
        int pivot = arr[l];
        int i= l-1;
        int j= l;
        System.out.println("****************  start partition ********************");
        System.out.println("  Pivot :: "+pivot);
        for(j=l;j<r;j++){
            
            if(arr[j]<= pivot){
                i++;
                swap(arr,j,i);
                print(arr);
            }
            
            
            
        }
        
          swap(arr,i,l);
          print(arr);
        
          System.out.println("****************  End partition ********************");
          return i;
    }


    public static void print(int[] arr){

           for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
           } 

           System.out.println();

    }

	
    public static int kthSmallest(int[] arr, int l, int r, int k) 
    { 
        if(l<=r){
             int index = partition(arr, l, r);
           if(index == k-1){
               return arr[index];
           }else if(index+1 > k){
               return kthSmallest(arr, l, index, k);
           }else{
               return kthSmallest(arr, index+1, r, k);
           }
        }
   
        return -1;
    } 

    public static void main(String[] args) {
     
        int[] arr= new int[]{7,10,4,20,15};
        int l=0;
        int r= arr.length;
        int value= kthSmallest(arr, l, r, 3);
        System.out.println("value "+value);
    }
}