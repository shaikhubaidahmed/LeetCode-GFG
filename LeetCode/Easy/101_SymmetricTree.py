"""
Problem Link : https://leetcode.com/problems/symmetric-tree/
Platform     : LeetCode
Difficulty   : Easy
"""

# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def isSymmetric(self, root: TreeNode | None) -> bool:
        def Mirror(left,right):
            if not left and not right:
                return True
            
            if not left or not right:
                return False
            if left.val!=right.val:
                return True

            return Mirror(left.left,right.right) and Mirror(left.right,right.right)
        
        if not root:
            return true

        return Mirror(root.left,root.right)
