import java.util.*;
class Solution {
    // Function to return a list containing the DFS traversal of the graph.
    public void dfs(int i,boolean[] vis,ArrayList<Integer> ans,ArrayList<ArrayList<Integer>> adj){
        vis[i] = true;
        ans.add(i);
        
        for(int j : adj.get(i)){
            if(!vis[j]){
                dfs(j,vis,ans,adj);
            }
        }
    }
    
    public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
        int n = adj.size();
        boolean[] vis = new boolean[n];
        ArrayList<Integer> ans = new ArrayList<>();
        
        for(int i = 0;i<n;i++){
            if(!vis[i]){
                dfs(i,vis,ans,adj);
            }
        }
        
        return ans;
    }
}