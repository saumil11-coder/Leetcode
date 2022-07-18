class Solution {
     public int rob1(int[] nums) {// space optimization
       
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
    public int rob(int[] nums) {
        int n=nums.length;
        int arr1[]=new int[n];
        int arr2[]=new int[n];
        if(n==1)
        {
            return nums[0];
        }
        for(int i=0;i<n;i++)
        {
            if(i!=0)
            {
                arr1[i]=nums[i];
            }
            if(i!=n-1)
            {
                arr2[i]=nums[i];
            }
        }
        int ans1=rob1(arr1);
        int ans2=rob1(arr2);
        return Math.max(ans1,ans2);
        
    }
}