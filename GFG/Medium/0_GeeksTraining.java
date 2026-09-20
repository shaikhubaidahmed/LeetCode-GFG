/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/geeks-training/1
 * Platform     : GFG
 * Difficulty   : Medium
 */

class Solution {
    public int maximumPoints(int mat[][]) {
        // code here
        int n=mat.length;
        int[][] dp=new int[n][4];
        
        dp[0][0]=Math.max(mat[0][1],mat[0][2]);
        dp[0][1]=Math.max(mat[0][0],mat[0][2]);
        dp[0][2]=Math.max(mat[0][0],mat[0][1]);
        dp[0][3]=Math.max(mat[0][1],Math.max(mat[0][2],mat[0][0]));
        
        for(int days=1;days<n;days++){
            for(int last=0;last<4;last++){
                int maxi=0;
                for(int i=0;i<=2;i++){
                    if(i!=last){
                        int points=mat[days][i]+dp[days-1][i];
                        maxi=Math.max(maxi,points);
                    }
                }
                dp[days][last]=maxi;
            }
        }
        
        return dp[n-1][3];
    }
}
