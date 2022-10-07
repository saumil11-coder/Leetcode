class Solution {
    public int minSubArrayLen(int target, int[] nums) 
    {
        if(nums==null || nums.length==0)
        {
            return 0;
            
        } int sum=0;
        int start=0,end=0; int minLength=Integer.MAX_VALUE;
        while(end<nums.length)
        {
            sum+=nums[end++]; 
            while(sum>=target)
            {
                minLength=Math.min(minLength,end-start);
                sum-=nums[start++];
            }
            
        }
        return minLength==Integer.MAX_VALUE?0:minLength;
        
    }
}