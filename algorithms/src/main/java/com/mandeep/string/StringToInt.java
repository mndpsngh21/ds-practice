package com.mandeep.string;

import java.math.BigInteger;
import java.util.ArrayList;

public class StringToInt {

	public static void main(String[] args) {
	
	//	System.out.println(multiplyStrings("505041410988047", "3318139"));
	//	System.out.println(multiplyStrings("11", "15"));
		//System.out.println(multiplyStrings("4416", "-333"));//-1470528
		//System.out.println(multiplyStrings("-628605", "-68"));//-1470528
		//System.out.println(multiplyStrings("-17194388", "91"));//-1470528
		System.out.println(isRotated("fsbcnuvqhffbsaqxwp", "wpfsbcnuvqhffbsaqx"));
		//System.out.println(nonrepeatingCharacter("hello"));
	}
	
	
	 public static boolean isRotated(String str1, String str2)
	    {
	        String rotated = str1.substring(2)+str1.substring(0, 2);
	        boolean isRotated= rotated.equalsIgnoreCase(str2);
     
	        
	        String rotated2 = str2.substring(2)+str2.substring(0, 2);
	        //String rotated2 = str2.substring(str2.length()-2, str2.length())+str2.substring(0,str2.length()-2);
	        boolean isRotated2= rotated2.equalsIgnoreCase(str1);
     
	         return isRotated2||isRotated;
	    }
	    
	
	static char nonrepeatingCharacter(String S)
    {
        //Your code here
        
        int[] chars= new int[28];
        
        
        
        for(int i=0; i< S.length();i++){
            int idx = S.charAt(i)-'a';
            chars[idx]=chars[idx]+1;
        }
        
        for(int i=0; i< S.length();i++){
            int idx = S.charAt(i)-'a';
            if(chars[idx]==1){
                return S.charAt(i);
            }
            
        }
        
        
        return '$';
    }
	
	  public static String multiplyStrings(String s1,String s2)
	    {
	        //code here.
		  if(s1.equalsIgnoreCase("0")) {
	        	return "0";
	        }
	        if(s2.equalsIgnoreCase("0")) {
	        	return "0";
	        } 
		  
		  String larger = toInt(s1)>toInt(s2)?s1:s2;
		  String smaller = toInt(s1)>toInt(s2)?s2:s1;
		  
		  String[] sa1 = larger.split("");
		  String[] sa2 = smaller.split("");
		  
		  ArrayList<String> results = new ArrayList<String>();
		  
		  boolean isNegative = false;
		  
		  if(s1.charAt(0)=='-') {
			  isNegative= isNegative?false:true;
		  }
		  if(s2.charAt(0)=='-') {
			  isNegative= isNegative?false:true;
		  }
		  
		  for(int i= sa2.length-1;i>=0;i--){
			  
			  if(smaller.charAt(i)=='-') {
				 // isNegative= isNegative?false:true;

				  continue;
			  }
			  
			  StringBuilder sb = new StringBuilder();
			  int multiplier =toInt(smaller.charAt(i));
	        	int carry=0;
	        	for(int k=1;k<sa2.length-i;k++) {
	        		sb.append("0");
	        	}
	            for(int j= sa1.length-1;j>=0;j--){
	            	 if(larger.charAt(j)=='-') {
	   				//  isNegative= isNegative?false:true;
	   				  continue;
	   			  }
	            	 
		        	int toMultiply =toInt(larger.charAt(j));
	                int result =(multiplier*toMultiply)+carry;
	                int val =result%10;
	                carry = result/10;
	                sb.append(val);
	            }    
	            
	            if(carry>0) {
	            	sb.append(carry);
	            }
	        	
	            results.add(sb.toString());
		  }
		  
		  
		   int length=0;
		   for(String result:results) {
	        	if(result.length()>length) {
	        		length=result.length();
	        	}
	  
	        }
	        StringBuilder sb = new  StringBuilder();
	        
	        int counter =0;
	        int sumCarry=0;
	        for(int i=0;i<length;i++) {
	            int sum=0;
	        	for(String result:results) {
	            	if(result.length()>i) {
	            		sum+=toInt(result.charAt(i));
	            	}
	            }
	        	   int val =(sum+sumCarry)%10;
	        	   sumCarry = (sum+sumCarry)/10;
	        	   sb.append(val);
	        }
	        if(sumCarry>0) {
            	sb.append(sumCarry);
            }
	        
	        
	        StringBuilder input1 = new StringBuilder();
     	  input1.append(sb.toString());
       	if(isNegative) {
     		input1.append("-");
     	}

     	  input1.reverse();
     	
	        String result= input1.toString();
	        
	        if(result.charAt(0)=='0') {
	        	result=result.substring(1);
	        }
		 
	        return result;
	    }
	  
	  
	  
		public static int toInt(char s) {	
			int asiiCode =(int)s;
			return asiiCode-48;
		}
	  
	  static  int strstr(String s, String x)
	    {
	       // Your code here
	       
	       int idx=0;
	       int firstIdx=-1;
	       
	       for(int i=0;i<s.length();i++){
	           
	           if(idx==0){
	               if(x.charAt(0)==s.charAt(i)){
	                   idx++;
	                   firstIdx=i;
	               }
	               
	           }
	           else{
	        	   if(idx>x.length()){
	                   return firstIdx;
	               }
	               
	               if(x.charAt(idx)==s.charAt(i)){
	                   idx++;
	               }
	               else{
	                   idx=0;

	            	   if(s.charAt(i-1)==x.charAt(idx)) {
	            		    idx++;
	 	                   firstIdx=i; 
	            	   }
	            	   else {
		                   firstIdx=-1;	            		   
	            	   }
	               }
	               
	           }
	           
	       }
	       return firstIdx;
	       
	    }
	  
	  
	  
	public static long toInt(String s) {	
		long num=0;
		boolean hasNegative=false;
		
		for(int i=0;i<s.length();i++) {
			int asiiCode =(int) s.charAt(i);
			if(i==0) {
				if(asiiCode==45) {
					hasNegative=true;
					continue;
				}
			}
			
			
			int val =asiiCode-48; // 48 is 0 ascii code
			num= num*10+val;
			
		}
		
		return num;
	}
	
}
