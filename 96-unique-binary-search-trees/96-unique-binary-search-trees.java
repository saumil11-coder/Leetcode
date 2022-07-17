class Solution {
    public int helper(int idx,int dp[])
    {
        if(idx==0||idx==1) return 1;
        if(dp[idx]!=-1) return dp[idx];
        int total=0;
        for(int i=1;i<=idx;i++)
        {
            int left=helper(i-1,dp);
            int right=helper(idx-i,dp);
             total+=left*right;
        }
        return dp[idx]=total;
        
    }
    
    
    public int numTrees(int n) { 
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        return helper(n,dp);
        
        
    }
}