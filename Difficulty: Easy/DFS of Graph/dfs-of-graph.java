class Solution {
    public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
        // code here
        int n=adj.size();
        ArrayList<Integer> ans=new ArrayList<>();
        Deque<Integer> q=new ArrayDeque<>();
        boolean[] vis=new boolean[n];
        
        q.push(0);
        vis[0]=true;
        while(!q.isEmpty()){
            int cur_node=q.pop();
            ans.add(cur_node);
            bfs(cur_node,ans,q,vis,adj);
        }
        
        return ans;
    }
    public void bfs(int cur_node,ArrayList<Integer> ans,Deque<Integer> q,boolean[] vis,ArrayList<ArrayList<Integer>> adj){
        for(Integer neigh:adj.get(cur_node)){
            if(!vis[neigh]){
                vis[neigh]=true;
            ans.add(neigh);
            bfs(neigh,ans,q,vis,adj);
            
            }
        }
    }
}