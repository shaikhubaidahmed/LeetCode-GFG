"""
Problem Link : https://leetcode.com/problems/maximum-width-of-binary-tree/
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
    def widthOfBinaryTree(self, root: TreeNode | None) -> int:
        if not root:
            return 0

        q=deque()
        q.append((root,0))
        ans=0
        while q:
            size=len(q)
            min_index=q[0][1]
            first=0
            last=0
            for i in range(size):
                node,index=q.popleft()
                index=index-min_index

                if i==0:
                    first=index
                if i==size-1:
                    last=index

                if node.left:
                    q.append((node.left,2*index))
                if node.right:
                    q.append((node.right,2*index+1))
                
            width=last-first+1
            ans=max(ans,width)
        return ans
