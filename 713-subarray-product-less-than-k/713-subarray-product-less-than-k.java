class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        int start=0; int end= 0; int n=nums.length;
        int prod=nums[0]; int count=0;
        while(start<n && end< n)
        {
            if(prod<k)
            {
                end++;
                if(end>=start)
                {
                    count+=end-start;
                }
                if(end<n)
                {
                    prod*=nums[end];
                }
            }
            else{
                prod/=nums[start];
                start++;
            }
        }
        return count;
        
    }
}