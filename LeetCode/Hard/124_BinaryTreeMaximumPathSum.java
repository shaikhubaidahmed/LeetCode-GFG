/**
 * Problem Link : https://leetcode.com/problems/binary-tree-maximum-path-sum/
 * Platform     : LeetCode
 * Difficulty   : Hard
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
    int mSum=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        
        if(root==null) return 0;
        maxPath(root);
        return mSum;
    }
    public int maxPath(TreeNode root){
        if(root==null) return 0;
        int lf=Math.max(maxPath(root.left),0);
        int rt=Math.max(maxPath(root.right),0);
        mSum=Math.max(mSum,root.val+lf+rt);
        return root.val+ Math.max(lf,rt);
    }
}
