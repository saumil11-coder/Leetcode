class Solution {
    public int findUnsortedSubarray(int[] nums) {
        int arr[]=nums.clone();
        Arrays.sort(arr);
        int start=0;int end=nums.length-1;
        for(;start<nums.length;start++)
        {
            if(nums[start]!=arr[start])
                break;
        }
        for(;end>=0;end--)
        {
            if(nums[end]!=arr[end])
            {
                break;
            }
        }
        if(start>=nums.length-1) return 0;
        return end-start+1;
    }
}