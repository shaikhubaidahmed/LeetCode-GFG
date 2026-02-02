class Solution {
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        // code here
        int n=adj.size();
        ArrayList<Integer> ans=new ArrayList<>();
        Queue<Integer> q=new LinkedList<>();
        boolean[] vis=new boolean[n];
        
        q.add(0);
        vis[0]=true;
        while(!q.isEmpty()){
            int cur_node=q.poll();
            ans.add(cur_node);
            for(Integer neigh:adj.get(cur_node)){
                if(!vis[neigh]){
                    q.add(neigh);
                    vis[neigh]=true;
                }
            }    
        }
        
        return ans;
        
    }
}