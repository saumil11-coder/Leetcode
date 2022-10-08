class Solution {
    public int threeSumClosest(int[] nums, int target) {
        Arrays.sort(nums);
        // initial closest result is the sum of first 3 values
        int result = nums[0] + nums[1] + nums[2]; 
        for (int i = 0; i < nums.length - 2 && result != target; i++) {
            int val = nums[i];
            int left = i + 1;
            int right = nums.length - 1;
            while (left < right && result != target) {
                int sum = nums[left] + nums[right];
                int total = val + sum;
                if (Math.abs(total - target) < Math.abs(result - target)) {
                    result = total;
                }
                
                if (total == target) break;
                if (total < target) {
                    left++;
                } else {
                    right--;
                }
            }
        }
        return result;
    }
}