class Solution {
    public int search(int[] nums, int target) {
        int low=0;
        int high=nums.length-1;
        while(low<=high)
        {
            int mid=(low+high)>>1;
            if(nums[mid]==target)return mid;
            if(nums[low]<=nums[mid])//left part is sorted
            {
                if(target>=nums[low]&& target<=nums[mid])
                {
                    high=mid-1;
                }
                else low=mid+1;
            }
            if(nums[mid]<nums[high])
            {
                if(target>=nums[mid]&& target<=nums[high])
                {
                    low=mid+1;
                }
                else high=mid-1;
            }
        }
        return -1;
        
    }
}