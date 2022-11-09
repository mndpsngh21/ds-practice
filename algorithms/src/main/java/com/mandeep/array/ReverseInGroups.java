package com.mandeep.array;

import java.util.*;

public class ReverseInGroups {


    static void printList(ArrayList<Integer> arr){

        for (Integer integer : arr) {
            System.out.print(integer+" ");
        }
        System.out.println();
    }

    static void reverseInGroups(ArrayList<Integer> arr, int n, int k) {
        int counter=0;
        printList(arr);

        while(counter+k<=n){
            int l=counter;
            int r= counter+k-1;
            counter+=k;
            while(l<r){
                int lval= arr.get(l);
                int rval= arr.get(r);
                arr.set(l, rval);
                arr.set(r, lval);
                l++;
                r--;
            }
        }

        if(counter<n){
            int l=counter;
            int r= n-1;
            while(l<=r){
                int lval= arr.get(l);
                int rval= arr.get(r);
                arr.set(l, rval);
                arr.set(r, lval);
                l++;
                r--;
            }

        }

        printList(arr);
    }


    public static void main(String[] args) {

     ArrayList<Integer> nums = new ArrayList<Integer>();
     nums.add(5);
     nums.add(6);
     nums.add(8);
     nums.add(9);
 //    nums.add(10);
     reverseInGroups(nums, nums.size(), 3);

        
    }
    
}
