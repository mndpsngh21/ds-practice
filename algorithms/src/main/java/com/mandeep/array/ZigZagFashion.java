package com.mandeep.array;

public class ZigZagFashion extends BaseClass {


     // order should be as below
    // arr[0] < arr[1]  > arr[2] < arr[3] > arr[4] < . . . . arr[n-2] < arr[n-1] > arr[n].
    

    static void zigZag(int arr[], int n) {
        // code here
        boolean isZig=true;
        printArray(arr);
 
        
        for(int i=0;i<arr.length-1;i++){
            
            if(isZig){
                isZig=false;
                if(arr[i]>arr[i+1]){
                    int temp= arr[i] ;
                    arr[i] = arr[i+1];
                    arr[i+1]=temp;  
                }

            }
            else{
                isZig=true;
                if(arr[i]<arr[i+1]){
                    int temp= arr[i] ;
                    arr[i] = arr[i+1];
                    arr[i+1]=temp;  
                }

            }
        }

        printArray(arr);
        
        
    }




    public static void main(String[] args) {
       int Arr[] = {1, 4, 3, 2};
       zigZag(Arr, Arr.length);

        
    }



}
