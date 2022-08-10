class Solution {
    public void helper(int node ,ArrayList<ArrayList<Integer>> adjList,int vis[])
    {
        vis[node]=1;
        
        for(Integer it:adjList.get(node))
        {
            if(vis[it]==0)
            {
                helper(it,adjList,vis);
            }
        }
    }
    public int findCircleNum(int[][] isConnected) {
        ArrayList<ArrayList<Integer>> adjList=new ArrayList<>();
        int  n=isConnected.length;
        for(int i=0;i<n;i++)
        {
            adjList.add(new ArrayList<>());
        }
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(isConnected[i][j]==1 && i!=j){//there is a node and there should be self node
                adjList.get(i).add(j);
                adjList.get(j).add(i);
                }
            }
        }
        int vis[]=new int[n];
        int count=0;
        for(int i=0;i<n;i++)
        {
            if(vis[i]==0)
            {
                count++;
                helper(i,adjList,vis);
            }
        }
            return count;    
    }
}