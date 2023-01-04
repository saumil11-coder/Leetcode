class Solution {
    public int minimumRounds(int[] tasks) {
        Map<Integer,Integer> mp = new HashMap<>();
        for(int i=0;i<tasks.length;i++)
        {
            mp.put(tasks[i],mp.getOrDefault(tasks[i],0)+1);
        }
        // System.out.println(mp);
        int ans  = 0;
        for(Map.Entry<Integer,Integer> entry : mp.entrySet())
        {
           
                if(entry.getValue()==1)        
                return -1;
            ans += (entry.getValue()/3) + (entry.getValue()%3)/2 + (entry.getValue()%3)%2;
        }
        return ans;
        }
}