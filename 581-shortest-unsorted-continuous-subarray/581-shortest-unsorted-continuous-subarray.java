class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int min=Integer.MAX_VALUE; int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]>nums[i+1])
            {
                min=Math.min(min,nums[i+1]);
            
            }
        }
        for(int i=nums.length-1;i>0;i--)
        {
            if(nums[i]<nums[i-1])
            {
                max=Math.max(max,nums[i-1]);
                
            }

            
        }
        int l=0;int r=0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]>min) {l=i; break;}
        }
        for(int i=nums.length-1;i>=0;i--)
        {
            if(nums[i]<max){ r=i; break;}
        }
        return r-l>0?r-l+1:0;
    
    }
}