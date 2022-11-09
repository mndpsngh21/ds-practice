package com.mandeep.array;

import java.util.Arrays;

public class MinimumHeight {

    public static void main(String[] args) {
        int[] arr = new int[]{2 ,6 ,3 ,4 ,7 ,2 ,10 ,3 ,2 ,1};
        int difference=getMinDiff(arr, arr.length, 5);
        System.out.println(difference);
    }




    static int getMinDiff(int[] arr, int n, int k) {
        Arrays.sort(arr);
        int l=0;
        int h =arr.length-1;
        int min = Integer.MIN_VALUE;   
        while(l<=h){              
            int lowMax = Math.max(arr[l]+k,arr[l]-k);           
            int lowMin = Math.min(arr[l]+k,arr[l]-k);           

            int heighMin = Math.min(arr[h]+k,arr[h]-k);
            int heighMax = Math.max(arr[h]+k,arr[h]-k);

            int lowMaxSelect =Math.max(lowMin,lowMax);            

            int highMinSelect =Math.min(heighMin,heighMax);
            if(highMinSelect>lowMaxSelect){
                highMinSelect =Math.max(heighMin,heighMax);
            }

            
            int difference= highMinSelect-lowMaxSelect;
            
            if(difference>0){
                min= Math.max(difference, min);
            }
            

            l++;
           h--;

        }

        return min;
    }


}
