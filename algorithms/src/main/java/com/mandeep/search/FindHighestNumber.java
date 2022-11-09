package com.mandeep.search;
import java.util.*;

public class FindHighestNumber {


    public static int findPeakElement(List<Integer> a)
    {
        int s=0;
        int e=a.size()-1;
        int peek=a.get(s);
        
        while(s<=e){
            int mid= (s+e)/2;

            if(a.get(mid)>=peek){
                peek=a.get(mid);
                s=mid+1;
            }
            else{
                e=mid-1;
            }

        }
        return peek;
    } 


    public static void main(String[] args) {
        String valuesStr="1 2 3 4 5";
        String[] values =valuesStr.split(" ");
        List<Integer> list= new ArrayList<Integer>();

        for(String val:values){
            list.add(Integer.parseInt(val));
        }
        System.out.println(findPeakElement(list));
    }

    
}
