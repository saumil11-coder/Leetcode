class Solution {
    public int pivotIndex(int[] nums) {
        int total=0;
        for(int i=0;i<nums.length;i++)
        {
            total+=nums[i];
        }
        int leftSum=0;
        for(int i=0;i<nums.length;i++)
        {
            if(i!=0) leftSum+=nums[i-1];
            if(total-leftSum-nums[i]==leftSum)
                return i;
        }
        return -1;
        
    }
}