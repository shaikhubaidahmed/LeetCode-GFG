/**
 * Problem Link : https://leetcode.com/problems/best-time-to-buy-and-sell-stock/
 * Platform     : LeetCode
 * Difficulty   : Easy
 */

class Solution {
    public int maxProfit(int[] prices) {
        int min=Integer.MAX_VALUE;
        int profit=0;
        for(Integer price:prices){
            min=Math.min(min,price);
            profit=Math.max(profit,price-min);
        }
        return profit;
    }
}
