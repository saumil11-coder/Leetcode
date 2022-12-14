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