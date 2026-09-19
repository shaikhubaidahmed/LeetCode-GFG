/**
 * Problem Link : https://practice.geeksforgeeks.org/problems/josephus-problem/1
 * Platform     : GFG
 * Difficulty   : Medium
 */

class Solution
{
   public int josephus(int n, int k)
    {
        //Your code here
        return n==1 ? 1:((k + josephus(n-1, k) - 1)%n + 1);
    }

}
