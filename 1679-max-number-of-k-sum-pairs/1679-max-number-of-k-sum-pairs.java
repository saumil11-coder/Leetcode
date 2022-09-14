class Solution {
    public int maxOperations(int[] nums, int k) {
        HashMap<Integer,Integer> mp =new HashMap<>();
        int count=0;
        for(int i=0;i<nums.length;i++)
        {
            if(mp.containsKey(k-nums[i])&& mp.get(k-nums[i])>0)
            {
                count++;
                mp.put(k-nums[i],mp.get(k-nums[i])-1);
            }
            else 
                mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
        }
        return count;
        
    }
}