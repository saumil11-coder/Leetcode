class Solution {
    public int maxOperations(int[] nums, int k) {
        Arrays.sort(nums);
       int left=0;int right=nums.length-1;
        int count=0;
        while(left<right)
        {
            int sum=nums[left]+nums[right];
            if(sum==k){
                left++;
              
                right--;
                  count++;
            }
            else if(sum>k){
                right--;}
            else {left++;}
        }
        return count;
    }
}