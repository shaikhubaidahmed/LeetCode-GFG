/**
 * Problem Link : https://leetcode.com/problems/best-time-to-buy-and-sell-stock-iv/
 * Platform     : LeetCode
 * Difficulty   : Hard
 */

class Solution {
    public int maxProfit(int k, int[] prices) {
        int[] buy=new int[k+1];
        int[] sell=new int[k+1];
        Arrays.fill(buy,Integer.MIN_VALUE);
        for(int price:prices){
            for(int i=1;i<=k;i++){
                buy[i]=Math.max(buy[i],sell[i]-price);
                sell[i]=Math.max(sell[i],buy[i]+price);
            }
        }
        return sell[k];
    }
}
