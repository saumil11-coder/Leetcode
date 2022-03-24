class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> num_map=new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++)
        {
            int compliment=target-nums[i];
            if(num_map.containsKey(compliment)){
                return  new int[]{num_map.get(compliment),i};
            }
                    num_map.put(nums[i],i);
        }
throw new IllegalArgumentException("no match found");
    }
}