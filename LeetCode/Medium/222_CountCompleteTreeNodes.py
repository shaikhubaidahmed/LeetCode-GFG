"""
Problem Link : https://leetcode.com/problems/count-complete-tree-nodes/
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
    def countNodes(self, root: TreeNode | None) -> int:
        if not root:
            return 0
        def left(node):
            h=0
            while node:
                h+=1
                node=node.left
            return h
        def right(node):
            h=0
            while node:
                h+=1
                node=node.right
            return h
        
        lf=left(root)
        rh=right(root)

        if lf==rh:
            return (1<<rh)-1

        return 1+self.countNodes(root.left)+self.countNodes(root.right)
