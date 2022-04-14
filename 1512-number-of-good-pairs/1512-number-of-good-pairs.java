class Solution {
    public int numIdenticalPairs(int[] nums) {
        var map=new HashMap<Integer,Integer>();
        int count=0;
        for(int num:nums)
        {
            int friendCount=map.getOrDefault(num,0);
            count+=friendCount;
            map.put(num,friendCount+1);
        }
        return count;
    }
}