class Solution {
    public int maxProfit(int[] arr) {
        int min=Integer.MAX_VALUE;
        int profit=0;
        for(int price:arr){
            min=Math.min(min,price);
            profit=Math.max(profit,price-min);
            
        }
        return profit;
    }
}