"""
Problem Link : https://leetcode.com/problems/validate-binary-search-tree/
Platform     : LeetCode
Difficulty   : Medium
"""

# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def isValidBST(self, root: TreeNode | None) -> bool:
        def check(node,low,high):
            if not node:
                return True
            
            if low<node.val and node.val<high:
                return check(node.left, low, node.val) and check(node.right,node.val,high)
            
            return False
        return check(root,float('-inf'),float('inf'))
