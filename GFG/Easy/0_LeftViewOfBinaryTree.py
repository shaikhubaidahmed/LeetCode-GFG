"""
Problem Link : https://practice.geeksforgeeks.org/problems/left-view-of-binary-tree/1
Platform     : GFG
Difficulty   : Easy
"""

''' Structure of Binary Tree Node
class Node:
    def __init__(self, val):
        self.data = val
        self.right = None
        self.left = None 
'''

class Solution:
    def leftView(self, root):
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
                if i==0:
                    ans.append(node.data)
                if node.left:
                    q.append(node.left)
                if(node.right):
                    q.append(node.right)
        return ans
