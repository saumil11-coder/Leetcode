// class Solution {
//     public boolean canJump(int[] nums) {
//         return helper(0,nums);//recursion 
        
//     }
//     public boolean helper(int idx,int nums[])
//     {
//         if(idx==nums.length-1)return true;
//         if(idx>nums.length-1) return false;
//         for(int j =1;j<=nums[idx];j++)
//         {
//             if(helper(idx+j,nums))
//                 return true;
            
//         }
        
//         return false;
//     }
// }




// class Solution {
//     public boolean canJump(int[] nums) {
//         int dp[]=new int[nums.length+1];
//         Arrays.fill(dp,-1);
//         return helper(0,nums,dp);
        
//     }
//     public boolean helper(int idx,int nums[],int dp[])
//     {
//         if(idx==nums.length-1)
//         {
//             dp[idx]=1;
//             return true;
//         }
//         if(idx>nums.length-1) 
//         {
//             dp[idx]=0;
//             return false;
//         }
//             if(dp[idx]==0)   return false;
//         if(dp[idx]==1) return true;
    
//         for(int j =1;j<=nums[idx];j++)
//         {
//             if(helper(idx+j,nums,dp)){
//                 dp[idx]=1;
//                 return true;}
            
//         }
//         dp[idx]=0;
//         return false;
//     }
// }



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









