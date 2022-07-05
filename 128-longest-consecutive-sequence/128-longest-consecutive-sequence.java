class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set=new HashSet<>();
        for(int val:nums)
        {
            set.add(val);
        }
        int longestStreak=0;
        for(int num:nums)
        {
            if(!set.contains(num-1))
            {
                int currentNum=num;
                int currentStreak=1;
            while(set.contains(currentNum+1))
            {
                currentNum+=1;
                currentStreak+=1;
            }
                 longestStreak=Math.max(currentStreak,longestStreak); 
            }
          
        }
        return longestStreak;
        
    }
}