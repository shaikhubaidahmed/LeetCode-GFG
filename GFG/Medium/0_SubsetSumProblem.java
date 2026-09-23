/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/subset-sum-problem-1611555638/1
 * Platform     : GFG
 * Difficulty   : Medium
 */

class Solution {
    static boolean isSubsetSum(int arr[], int k) {
        // code here
        int n=arr.length;
        boolean [][] dp=new boolean [n][k+1];
        for(int i=0;i<n;i++){
            dp[i][0]=true;
        }
if (arr[0] <= k) dp[0][arr[0]]=true;
        
        for(int i=1;i<n;i++){
            for(int j=1;j<=k;j++){
                boolean notTake=dp[i-1][j];
                boolean take=false;
                if(j-arr[i]>=0){
                    take=dp[i-1][j-arr[i]];
                }
                dp[i][j]=take || notTake;
            }
        }
        return dp[n-1][k];
    }
}
