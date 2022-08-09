class Solution {
    public int pivotIndex(int[] nums) {
        int leftSum=0;
        int sum=0;
        for(int i:nums)
        {
            sum+=i;
        }
        for(int i=0;i<nums.length;i++)
        {
            sum-=nums[i];
            if(sum==leftSum) return i;
            else leftSum+=nums[i];
        }
        return -1;
    }
}