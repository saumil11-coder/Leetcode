class Solution {
    public int[] sumEvenAfterQueries(int[] nums, int[][] queries) {
        int n = queries.length;
        int[] ans = new int[n];
        int sum = 0;
        for(int num: nums) {
            if((num & 1) == 0) {
                sum += num;
            }
        }
        int i = 0;
        for(int[] query: queries) {
            int idx = query[1];
            int val = query[0];
            if((nums[idx] & 1) == 0) {
                sum -= nums[idx];
            }
            nums[idx] += val;
            if((nums[idx] & 1) == 0) {
                sum += nums[idx];
            }
            ans[i++] = sum;
        }
        return ans;
    }
}