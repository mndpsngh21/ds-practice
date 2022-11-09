package com.mandeep.search;

import java.util.Arrays;

public class IsSubSet {

    public static String isSubset( long a1[], long a2[], long n, long m) {
        Arrays.sort(a1);
        Arrays.sort(a2);
        for(int i=0;i<a2.length;i++){
            long value = a2[i];
            int index = binarySearch(value, a1);
            if(index==-1){
                return "No";
            }

            // count occurences 
            int a1Occurences = getOccerences(value,a1);
            int a2Occurences = getOccerences(value,a2);
            if(a1Occurences<a2Occurences){
                return "No"; 
            }  
        
        }    


        return "Yes";
    }

    public static int getOccerences(long value, long[] array){
       int count=0;
       for(int i=0;i<array.length;i++){
        if(array[i]==value){
            count++;
        }
       } 
       return count;
    }


    public static int binarySearch(long value, long arr[]){
        int s = 0;
        int e = arr.length-1;
        while(s<=e){
            int mid= (s+e)/2;
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

    
    public static void main(String[] args) {
        long a1[]= {11, 1, 13, 21, 3, 7};
        long a2[]={11, 3, 7, 1};
        System.out.println(isSubset(a1, a2, a1.length, a2.length)); 

    }


}
