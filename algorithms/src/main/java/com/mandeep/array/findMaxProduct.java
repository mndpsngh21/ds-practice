package com.mandeep.array;

public class findMaxProduct {

    static long findMaxProduct(int A[], int n, int k)
    {
        long maxProduct=0;
	    // Your code here	
        for(int i=0;i<=n-k;i++){
             long product=A[i];
            for(int j=i+1;j<i+k;j++){
                product*= A[j];
            }
            if(product>maxProduct){
                maxProduct=product;
            }
        }

        return maxProduct;
    }

    public static void main(String[] args) {
        int[] a= new int[]{1,2,3,4};
        findMaxProduct(a, a.length, 2);
    }

}
