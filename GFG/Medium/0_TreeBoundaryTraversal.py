"""
Problem Link : https://practice.geeksforgeeks.org/problems/boundary-traversal-of-binary-tree/1
Platform     : GFG
Difficulty   : Medium
"""

'''
Definition for Node
class Node:
    def __init__(self, val):
        self.data = val
        self.right = None
        self.left = None
'''

class Solution:
    
    def is_Leaf(self,root):
        return not root.left and not root.right
            
    
    def leftTraversal(self,root,ans):
        curr=root.left
        while curr:
            if not self.is_Leaf(curr):
                ans.append(curr.data)
            
            if curr.left:
                curr=curr.left
            else:
                curr=curr.right
        
    def rightTraversal(self,root,ans):
        curr=root.right
        temp=[]
        while curr:
            if not self.is_Leaf(curr):
                temp.append(curr.data)
            
            if curr.right:
                curr=curr.right
            else:
                curr=curr.left
        ans.extend(temp[::-1])
        
    def rootTraversal(self,root,ans):
        if root is None:
            return
        if self.is_Leaf(root):
            ans.append(root.data)
        
        self.rootTraversal(root.left,ans)
        self.rootTraversal(root.right,ans)        
    def boundaryTraversal(self, root):
        # code here
        ans=[]
        if root is None:
            return ans
    
        if not self.is_Leaf(root):
            ans.append(root.data)
        
        self.leftTraversal(root,ans)
        self.rootTraversal(root,ans)
        self.rightTraversal(root,ans)
        
        return ans;
        
        
