/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/geek-jump/1
 * Platform     : GFG
 * Difficulty   : Medium
 */

class Solution {
    int minCost(int[] h) {
        // code here
        int n=h.length;
        int[] dp=new int[n];
        dp[0]=0;
        
        for(int i=1;i<n;i++){
            int fs=dp[i-1]+Math.abs(h[i]-h[i-1]);
            int ss=Integer.MAX_VALUE;
            if(i>1){
                ss=dp[i-2]+Math.abs(h[i]-h[i-2]);
            }
            dp[i]=Math.min(fs,ss);
        }
        
        return dp[n-1];
    }
    
}
