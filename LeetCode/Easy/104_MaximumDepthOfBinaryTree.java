/**
 * Problem Link : https://leetcode.com/problems/maximum-depth-of-binary-tree/
 * Platform     : LeetCode
 * Difficulty   : Easy
 */

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int maxDepth(TreeNode root) {
        if(root==null) return 0;

        int lmax=maxDepth(root.left);
        int rmax=maxDepth(root.right);
        return Math.max(lmax,rmax)+1;
    }
}
