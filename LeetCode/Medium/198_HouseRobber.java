/**
 * Problem Link : https://leetcode.com/problems/house-robber/
 * Platform     : LeetCode
 * Difficulty   : Medium
 */

class Solution {
    public int rob(int[] arr) {
        int n=arr.length;
         int prev2=0;
         int prev=arr[0];
        int curri=0;
         for(int i=1;i<n;i++){
            int take=arr[i];
            if(i>1){
                take+=prev2;
            }
            int nottake=prev;
            curri=Math.max(take,nottake);
            prev2=prev;
            prev=curri;
         }
         return prev;
    }
}
