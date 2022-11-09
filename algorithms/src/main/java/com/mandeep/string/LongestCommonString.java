package com.mandeep.string;

public class LongestCommonString {

    static int longestCommonSubstr(String S1, String S2, int n, int m){
        // code here
           int LCStuff[][] = new int[n + 1][m + 1];
           
            char[] X= S1.toCharArray();
            char[] Y= S2.toCharArray();
           
            int result = 0;
         for (int i = 0; i <= n; i++)
        {
            for (int j = 0; j <= m; j++)
            {
                
                if (i == 0 || j == 0)
                    LCStuff[i][j] = 0;
                else if (X[i - 1] == Y[j - 1])
                {
                    LCStuff[i][j]
                        = LCStuff[i - 1][j - 1] + 1;
                    result = Integer.max(result,
                                         LCStuff[i][j]);
                }
                else
                    LCStuff[i][j] = 0;
            }
        }
        
        return result;
    }
    
    public static void main(String[] args) {
    	String S1 = "ABCDGH", S2 = "ACDGHR";
    	int n = 6, m = 6;
		System.out.println(longestCommonSubstr(S1, S2, n, m));
	}
    
}
