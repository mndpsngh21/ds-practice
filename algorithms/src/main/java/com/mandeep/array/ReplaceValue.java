package com.mandeep.array;

public class ReplaceValue {


   static int countNumbers(int num){
        int count=0;        
        int divider=1;
        while(num/divider>0){
              divider*=10;
             count++;   
        }
        return count;        
    }
    
    
  static int convertfive(int num) {
        // Your code here
       int count = countNumbers(num);
       int replaced=0; 
       int multiplier =1;

       for(int i=1;i<count;i++){
        multiplier*=10;
       }

       for(int i=count;i>0;i--){
            int indexval = num/multiplier;
            if(indexval!=5){
                replaced+=indexval*multiplier;
            }
            else{
                replaced+=0*multiplier;
            }
            num-=indexval*multiplier;
            multiplier/=10;
       }
       return replaced;        
    }
    

    public static void main(String[] args) {
     System.out.println(convertfive(1554));;
    }
}
