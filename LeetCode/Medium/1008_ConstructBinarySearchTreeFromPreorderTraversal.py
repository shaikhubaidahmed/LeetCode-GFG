"""
Problem Link : https://leetcode.com/problems/construct-binary-search-tree-from-preorder-traversal/
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
    def bstFromPreorder(self, preorder: list[int]) -> TreeNode | None:
        self.i=0
        def build(low,high):
            if self.i==len(preorder):
                return None
            val=preorder[self.i]
            if low<=val<=high:
                self.i+=1
                node=TreeNode(val)
                node.left=build(low,val)
                node.right=build(val,high)
                return node
            return None
        return build(float('-inf'),float('inf'))

