"""
Problem Link : https://practice.geeksforgeeks.org/problems/right-view-of-binary-tree/1
Platform     : GFG
Difficulty   : Easy
"""

'''
Definition for Node
class Node:
    def __init__(self, val):
        self.data = val
        self.left = None
        self.right = None
'''
class Solution:
    def rightView(self, root):
        # code here
        if not root:
            return []
        ans=[]
        q=deque()
        q.append(root)
        
        while q:
            size=len(q)
            for i in range(size):
                node =q.popleft()
                if i==size-1:
                    ans.append(node.data)
                if node.left:
                    q.append(node.left)
                if(node.right):
                    q.append(node.right)
        return ans            
