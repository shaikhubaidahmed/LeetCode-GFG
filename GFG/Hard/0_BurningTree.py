"""
Problem Link : https://practice.geeksforgeeks.org/problems/burning-tree/1
Platform     : GFG
Difficulty   : Hard
"""

''' Structure of binary tree node
class Node:
    def __init__(self, val):
        self.data = val
        self.left = None
        self.right = None
'''

class Solution:
    def minTime(self, root, k):
        # code here
        parent={}
        target=None
        def dfs(node):
            nonlocal target
            if not node:
                return 0
            if node.data==k:
                target=node
            if node.left:
                parent[node.left]=node
                dfs(node.left)
            if node.right:
                parent[node.right]=node
                dfs(node.right)
        
        dfs(root)
        q=deque([target])
        visited=set([target])
        time=0
        while q:
            size=len(q)
            burned=False
            for i in range(size):
                node=q.popleft()
                if node.left and node.left not in visited:
                    visited.add(node.left)
                    q.append(node.left)
                    burned=True
                if node.right and node.right not in visited:
                    visited.add(node.right)
                    q.append(node.right)
                    burned=True
                if node in parent and parent[node] not in visited:
                    visited.add(parent[node])
                    q.append(parent[node])
                    burned=True
            
            if burned:
                time+=1
        return time
