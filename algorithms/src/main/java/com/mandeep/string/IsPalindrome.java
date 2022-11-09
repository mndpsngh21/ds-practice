package com.mandeep.string;

public class IsPalindrome {

	
	 static int isPalindrome(String S) {
	        
	        int length=S.length();
	        int r=length-1;
	        int l=0;
	        while(l<r){
	            if(S.charAt(r)!=S.charAt(l)){
	                return 0;
	            }
	            r--;
	            l++;
	        }
	        return 1;
	    }
	 
	 
	 public static void main(String[] args) {
		isPalindrome("qmoeeomq");
	}
}
