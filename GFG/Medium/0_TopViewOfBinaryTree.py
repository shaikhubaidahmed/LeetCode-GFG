"""
Problem Link : https://practice.geeksforgeeks.org/problems/top-view-of-binary-tree/1
Platform     : GFG
Difficulty   : Medium
"""

'''
class Node:
    def __init__(self, val):
        self.data = val
        self.left = None
        self.right = None
'''

class Solution:
    def topView(self, root):
        # code here
        if not root:
            return []
        
        q=deque([(root,0)])
        mp={}
        min_hd=max_hd=0
        while q:
            node,hd=q.popleft()
            if hd not in mp:
                mp[hd]=node.data
            
            min_hd=min(min_hd,hd)
            max_hd=max(max_hd,hd)
            
            if node.left:
                q.append((node.left,hd-1))
            if(node.right):
                q.append((node.right,hd+1))
            
        return [mp[hd] for hd in range(min_hd,max_hd+1)]     
        
        
        
