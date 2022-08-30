class Solution {
    public int coinChange(int[] coins, int amount) {
        int n=coins.length;
        
        int dp[][]=new int[n][amount+1];
        for(int row[]:dp)
            Arrays.fill(row,-1);
        int ans= helper(coins.length-1,coins,amount,dp);
        if(ans>=(int)Math.pow(10,9)) return -1;
        return ans;
        
    }
    public int helper(int idx,int coins[],int target,int dp[][])
    {
        if(idx==0)
        {
            if(target%coins[0]==0) return (target/coins[0]);
            return (int)Math.pow(10,9);
        }
        if(dp[idx][target]!=-1) return dp[idx][target];
        int nottake=0+helper(idx-1,coins,target,dp);
        int take=(int)Math.pow(10,9);
        if(coins[idx]<=target) take=1+helper(idx,coins,target-coins[idx],dp);
        return  dp[idx][target]=Math.min(nottake,take);
        
    }
}