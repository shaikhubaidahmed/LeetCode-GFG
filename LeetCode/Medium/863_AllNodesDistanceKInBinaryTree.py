"""
Problem Link : https://leetcode.com/problems/all-nodes-distance-k-in-binary-tree/
Platform     : LeetCode
Difficulty   : Medium
"""

# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    def distanceK(self, root: TreeNode, target: TreeNode, k: int) -> List[int]:
        if not root:
            return []
        
        ## Fill Parents
        parent={}
        q=deque([root])
        
        while q:
            node =q.popleft()

            if node.left:
                parent[node.left]=node
                q.append(node.left)
            if node.right:
                parent[node.right]=node
                q.append(node.right)
        
        q=deque([target])
        visited=set([target])
        dist=0
        ans=[]
        while q:
            size=len(q)

            if dist==k:
                while q:
                    ans.append(q.popleft().val)
                return ans
            
            for i in range(size):
                node=q.popleft()
                if node.left and node.left not in visited:
                    visited.add(node.left)
                    q.append(node.left)
                if node.right and node.right not in visited:
                    visited.add(node.right)
                    q.append(node.right)
                if node in parent and parent[node] not in visited:
                    visited.add(parent[node])
                    q.append(parent[node])
            dist=dist+1
        return ans 
