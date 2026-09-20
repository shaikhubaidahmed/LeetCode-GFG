/**
 * Problem Link : https://leetcode.com/problems/house-robber-ii/
 * Platform     : LeetCode
 * Difficulty   : Medium
 */

//we use same soln as house robber, with one addition: we either solve the problem same as 
//house robber, but from ind 0 to n-2 or from ind 1 to n-1
class Solution {
    public int rob(int[] nums) {
        if(nums.length == 1) return nums[0];
        //we go left to right so dp[i] indicates max loot from ind 0 to i houses
        int first = 0;
        int second = 0;
        int prev2 = 0;
        int prev = 0;
        for(int i=0; i<nums.length-1; i++){
            int pick = nums[i] + prev2;
            int noPick = 0 + prev;
            int curr = Math.max(pick, noPick);
            prev2 = prev;
            prev = curr;
        }
        first = prev;  //only because we need to compare
        //resetting before next iteration
        prev2 = 0;
        prev = 0;
        for(int i=1; i<nums.length; i++){
            int pick = nums[i] + prev2;
            int noPick = 0 + prev;
            int curr = Math.max(pick, noPick);
            prev2 = prev;
            prev = curr;
        }
        second = prev;   //prev contains max upon reaching end of loop
        return first>second? first:second;
    }
}
