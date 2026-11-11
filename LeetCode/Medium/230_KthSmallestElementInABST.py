"""
Problem Link : https://leetcode.com/problems/kth-smallest-element-in-a-bst/
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
    def kthSmallest(self, root: TreeNode | None, k: int) -> int:
        self.count=0
        self.ans=-1

        def dfs(node):
            if not node or self.ans!=-1:
                return
            dfs(node.left)
            self.count+=1
            if(self.count==k):
                self.ans=node.val
                return 
            dfs(node.right)
        
        dfs(root)
        return self.ans
