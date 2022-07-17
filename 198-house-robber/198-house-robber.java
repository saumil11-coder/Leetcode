// class Solution {// memoization 
//     public int helper(int idx,int nums[],int dp[])
//     {
//         if(idx==0)return nums[idx];
//         if(idx<0)return 0;
//         if(dp[idx]!=-1){return dp[idx];}
//         int pick=nums[idx]+helper(idx-2,nums,dp);
//         int notPick=0+helper(idx-1,nums,dp);
//         return dp[idx]=Math.max(pick,notPick);
//     }
//     public int rob(int[] nums) {
       
//         int n=nums.length;
//          int dp[]=new int[n];
//         Arrays.fill(dp,-1);
//         return helper(n-1,nums,dp);
        
//     }
// }
// class Solution { //tabulation
  
//     public int rob(int[] nums) {
       
//         int n=nums.length;
//         int dp[]=new int[n+1];
//         dp[0]=nums[0];
//         for(int i=1;i<n;i++)
//         {
//             int take=nums[i];
//             if(i>1)
//                 take+=dp[i-2];
//             int notTake=0+dp[i-1];
//             dp[i]=Math.max(take,notTake);
//         }
//         return dp[n-1];
        
        
        
//     }
// }

class Solution { //tabulation
  
    public int rob(int[] nums) {
       
        int n=nums.length;
        
        int prev=nums[0];
        int prev2=0;
        for(int i=1;i<n;i++)
        {
            int take=nums[i];
            if(i>1)
                take+=prev2;
            int notTake=0+prev;
        int curr_i=Math.max(take,notTake);
            prev2=prev;
            prev=curr_i;
        }
        return prev;
        
    }
}