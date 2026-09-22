/**
 * Problem Link : https://leetcode.com/problems/triangle/
 * Platform     : LeetCode
 * Difficulty   : Medium
 */

class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n=triangle.size();
        // System.out.println(n);
        int[][] dp=new int[n][n];

        for(int j=0;j<n;j++){
            dp[n-1][j]=triangle.get(n-1).get(j);
        }

        for(int i=n-2;i>=0;i--){
            for(int j=i;j>=0;j--){
                int down=triangle.get(i).get(j)+dp[i+1][j];
                int dg=triangle.get(i).get(j)+dp[i+1][j+1];

                dp[i][j]=Math.min(down,dg);
            }
        }

        return dp[0][0];
    }
}
