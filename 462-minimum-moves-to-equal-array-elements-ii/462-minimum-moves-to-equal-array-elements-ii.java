class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
        long median=nums[nums.length/2];
        long minimumMoves=0;
        for(int i=0;i<nums.length;i++)
        {
            minimumMoves+=Math.abs(median-nums[i]);
        }
        return (int)minimumMoves;
    }
}