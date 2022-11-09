package com.mandeep.array;

public class MaxConsecutiveSteps {


    static int maxStep(int A[], int N)
    {
        int steps=0;
        int maxHeight=0;
        for(int i=1;i<A.length;i++){
            if(A[i]-A[i-1]>0){
                steps++;
            }
            else{
                if(steps>maxHeight){
                    maxHeight=steps;
                }
                steps=0;    
            }
            if(steps>maxHeight){
                maxHeight=steps;
            }
        }
        return maxHeight;
    }

    public static void main(String[] args) {

        int A[] = {1,2,3,2,2};
        System.out.println( maxStep(A, A.length));;
        
    }
    
}
