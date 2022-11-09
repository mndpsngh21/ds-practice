package com.mandeep.string;

public class LongestPalindrom {
	
	   static String longestPalin(String S){
		    int maxLength=0;
		       int startIndex=0;
		       int endIndex=0;
		       

		       for(int i=0;i<S.length();i++){
		           for(int j=i;j<=S.length();j++){
		              String subStr = S.substring(i,j);
		              String rev= reverseString(subStr);
		              if(subStr.equals(rev)){
		                  int length= j-i;
		                  if(length>maxLength){
		                      maxLength=length;
		                      startIndex=i;
		                      endIndex=j;
		                  }
		              }
		               
		           }        
		       }        
		        
		        
		        return S.substring(startIndex,endIndex);          
	        
	    }
	    
	    
	    static String reverseString(String s){
	        StringBuilder sb = new StringBuilder();
	        for(int i = s.length()-1 ;i>=0;i--){
	            sb.append(s.charAt(i));
	        }
	        return sb.toString();
	    }
	    
	    
	    
	  
	    public static void main(String[] args) {
			System.out.println(longestPalin("aaaabbaa"));
			System.out.println(longestPalinEfficent("aaaabbaa"));
		}

	    
	    static int start = 0,end = 0;
	    private static int count(String s , int l , int r, int n) {
	    	while(l>=0 && r<n && s.charAt(l)== s.charAt(r)) {
				l--;
				r++;
			}
	    	start= l+1;
	    	end = r-1;
	    	return r-l;
	    }

		private static String longestPalinEfficent(String s) {
			int maxLength=0;
			
			int n=s.length();
			String ans="";
			
			for(int i=0;i<n-1;i++) {
			
				int oddCount= count(s, i, i+1, n);
				if(oddCount>maxLength) {
					maxLength = oddCount;
					 ans = s.substring(start,end+1);
				}
				
				int evenCount= count(s, i-1, i+1, n);
				if(evenCount>maxLength) {
					maxLength = evenCount;
					 ans = s.substring(start,end+1);
				}
				
		    }
			
			
			if(ans.length()<=1) {
				return s.substring(0,1);
			}
			return ans;	
		}

}
