/**
 * Problem Link : https://leetcode.com/problems/best-time-to-buy-and-sell-stock-with-transaction-fee/
 * Platform     : LeetCode
 * Difficulty   : Medium
 */

class Solution {
    public int maxProfit(int[] prices, int fee) {
        int buy = Integer.MIN_VALUE;
        int sell = 0;

        for (int price : prices) {
            buy = Math.max(buy, sell - price);
            sell = Math.max(sell, buy + price - fee);
        }

        return sell;
    }
}
