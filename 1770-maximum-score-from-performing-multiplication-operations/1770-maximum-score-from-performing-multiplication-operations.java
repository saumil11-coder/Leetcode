class Solution {  
    int[][] dp;
    public int maximumScore(int[] nums, int[] multipliers) {
        dp = new int[multipliers.length][multipliers.length];
        return max(nums, 0, nums.length - 1, multipliers, 0);
    }
    public int max(int[] nums, int start, int end, int[] multipliers, int itr) {
        if (itr == multipliers.length)
            return 0;
        if (dp[start][itr] != 0) 
            return dp[start][itr];
        dp[start][itr] = Math.max(nums[start] * multipliers[itr] + max(nums, start + 1, end, multipliers, itr + 1), nums[end] * multipliers[itr] + max(nums, start, end - 1, multipliers, itr + 1));
        return dp[start][itr];
    }
}