package com.mandeep.array;

public class FindNumbersNum {

    public static int num(int a[], int n, int k) {
       int o_count = 0;
        for (int i = 0; i < n; i++) {
            int temp = a[i];
            while (temp != 0) {
                int digit = temp % 10;
                if (digit == k){
                    o_count++;
                }
                temp = temp / 10;
            }
        }
        return o_count;
    }

    public static void main(String[] args) {
        int a[] = new int[] { 11, 12, 13, 14, 15 };
        System.out.println(num(a, a.length, 1));
    }

}
