class Solution {
    public boolean helper(int idx,int target,int arr[],int dp[][])
    {
        if(target==0)return true;
        if(idx==0)return arr[0]==target;
  
    if(dp[idx][target]!=-1)
        return dp[idx][target]==0?false:true;
        boolean nottake=helper(idx-1,target,arr,dp);
        boolean take=false;
        if(arr[idx]<=target)
        {
            take=helper(idx-1,target-arr[idx],arr,dp);
            
        }
        dp[idx][target]=nottake||take?1:0;
        return take||nottake;
        
    }
    public boolean canPartition(int[] nums) {
        int totSUM=0;
        int n=nums.length;
        for(int i=0;i<nums.length;i++)
        {
            totSUM+=nums[i];
        }
        if(totSUM%2==1)return false;
        else{
            int k=totSUM/2;
            int dp[][]=new int[n][k+1];
            for(int row[]:dp)
                Arrays.fill(row,-1);
            return helper(n-1,k,nums,dp);
        }
        
    }
}
