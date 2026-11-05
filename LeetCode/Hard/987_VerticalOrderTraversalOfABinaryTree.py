"""
Problem Link : https://leetcode.com/problems/vertical-order-traversal-of-a-binary-tree/
Platform     : LeetCode
Difficulty   : Hard
"""

# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def verticalTraversal(self, root: TreeNode | None) -> list[list[int]]:
        nodes=[]

        def dfs(node,row,col):
            if not node:
                return
            nodes.append((col,row,node.val))
            dfs(node.left,row+1,col-1)
            dfs(node.right,row+1,col+1)
        dfs(root,0,0)
        ans=[]
        nodes.sort()
        prevC=None
        for col,row,val in nodes:
            if prevC!= col:
                ans.append([])
                prevC=col
            ans[-1].append(val)
        return ans
