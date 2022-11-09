package com.mandeep.array;

public class RotateArray {

    public static int[] fromString(String s){
        String[] arr= s.split(" ");

        int[]  intArr = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            intArr[i]= Integer.parseInt(arr[i]);
        }
        return intArr;
    }


    public static void main(String[] args) {
        String aString="40 13 27 87 95 40 96 71 35 79 68 2 98 3 18 93 53 57 2 81 87 42 66 90 45 20 41 30 32 18 98 72 82 76 10 28 68 57 98 54 87 66 7 84 20 25 29 72 33 30 4 20 71 69 9 16 41 50 97 24 19 46 47 52 22 56 80 89 65 29 42 51 94 1 35 65 25";
        int[] arr = fromString(aString);
        rotateArr(arr, 69, arr.length);
        print(arr);
    }
    
    public static void print(int[] arr){

        for(int i=0;i<arr.length;i++){
         System.out.print(arr[i]+" ");
        } 

        System.out.println();

 }

    static void rotateArr(int arr[], int d, int n)
    {
        // add your code here
        int[] s = new int[d];

        int counter=0;
        for(int i=0;i<d;i++){
            s[i]=arr[i];
            counter++;
        }

        int curIndex=0;
        for(int j=0;j<n-d;j++){
               arr[j]=arr[counter];
               counter++; 
               curIndex++;
        }
 
        for(int i=0;i<d;i++){
            arr[curIndex]=s[i];
            curIndex++;
        }


    }

}
