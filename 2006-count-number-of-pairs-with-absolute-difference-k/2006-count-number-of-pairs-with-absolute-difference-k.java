class Solution {
    public int countKDifference(int[] nums, int k) {
        int count=0;
        int n=nums.length;
        HashMap<Integer,Integer> mp =new HashMap<>();
        for(int i=0;i<n;i++)
        {
            if(mp.containsKey(nums[i]))
            {
                mp.put(nums[i],mp.get(nums[i])+1);
            }
         else   mp.put(nums[i],1);
        }
        for(int i=0;i<n;i++)
        {
            if(mp.containsKey(nums[i]-k))
            {
                count+=mp.get(nums[i]-k);
            }
            
        }
        return count;
        
    }
}
