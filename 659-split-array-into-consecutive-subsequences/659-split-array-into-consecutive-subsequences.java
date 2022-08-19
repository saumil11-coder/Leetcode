class Solution {
    public boolean isPossible(int[] nums) {
        if(nums.length<3) return false;
        Map<Integer,Integer> mp=new HashMap<>();
        for(int i:nums)
        {
            mp.put(i,mp.getOrDefault(i,0)+1);
            
        }
        PriorityQueue<Integer> queue=new PriorityQueue<>(mp.keySet().size());
        for(int i:mp.keySet())
        {
            queue.offer(i);
        }
        while(!queue.isEmpty())
        {
            int min=queue.peek();
            int count=0;
            while(true)
            {
                if(!mp.containsKey(min))
                {
                    if(count<3)return false;
                    break;
                
            }
            mp.put(min,mp.get(min)-1);
            count++;
            if(mp.get(min)==0){
            
             if(min!=queue.peek()) return false;
                 queue.poll();
            
            }
        if(mp.containsKey(min+1) && mp.get(min)+1>mp.get(min+1))
        {
            if(count<3)return false;
            break;
        }
            min+=1;
        }
        }
        return true;
    }
}