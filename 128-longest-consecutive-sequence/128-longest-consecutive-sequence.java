class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hs=new HashSet<>();
        for(int val:nums)
        {
            hs.add(val);
        }
        int longestStreak=0;
        for(int val:nums)
        {
            if(!hs.contains(val-1))
            {
                int currentNum=val;
                int currentStreak=1;
                while(hs.contains(currentNum+1))
                {
                    currentNum+=1;
                    currentStreak+=1;

                }
                longestStreak=Math.max(longestStreak,currentStreak);
            }
            
        }
        return longestStreak;
    }
}