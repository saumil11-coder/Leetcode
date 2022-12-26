class Solution {
    
    public boolean canJump(int[] nums) {
        int n=nums.length-1;
    
        int dp[]=new int[n+1];
        dp[n]=1;
        for(int i=n-1;i>=0;i--)
        {
            for(int j=1;j<=nums[i];j++)
            {
                if(dp[i+j]==1)
                {
                    dp[i]=1;
                    break;
                }
            }
        }
        return dp[0]==0?false:true;
        
    }
}

