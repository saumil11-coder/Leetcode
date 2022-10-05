class Solution {
    public int numTrees(int n) {
        int dp[]=new int[n+1];
         dp[0]=1;
         dp[1]=1;
    for(int i=2;i<dp.length;i++)
    {
        int l=0; int r=i-1;
        while(l<=(i-1))
        {
            dp[i]+=dp[l]*dp[r];
            l++;
            r--;
        }
    }
        return dp[n];
        
    }
}