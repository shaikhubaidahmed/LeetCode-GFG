/**
 * Problem Link : https://leetcode.com/problems/best-time-to-buy-and-sell-stock-with-cooldown/
 * Platform     : LeetCode
 * Difficulty   : Medium
 */

class Solution {
    public int maxProfit(int[] prices) {
        int n=prices.length;
        int[][] dp=new int[n+2][2];
        dp[n][0]=0;
        dp[n][1]=0;

        for(int ind=n-1;ind>=0;ind--){
            for(int i=0;i<=1;i++){
                int profit=0;
                if(i==1){
                    profit=Math.max(-prices[ind]+dp[ind+1][0],dp[ind+1][1]);
                }else{
                    profit=Math.max(prices[ind]+dp[ind+2][1],dp[ind+1][0]);
                }
                dp[ind][i]=profit;
            }
        }
        return dp[0][1];
    }
}
