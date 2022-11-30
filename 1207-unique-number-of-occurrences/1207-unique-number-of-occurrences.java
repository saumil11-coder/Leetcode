class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> mp = new HashMap<>();
        for(int i: arr)
        {
            mp.put(i, mp.getOrDefault(i,0)+1);
            
        }
    List<Integer> list = new ArrayList<>();
    
        for(int i:mp.values())
        {
            list.add(i);
        }
        int n=list.size();
           Set<Integer> set = new HashSet<>();
        for(int i:list)
        {
            set.add(i);
        }
        int r = set.size();
        if(n==r) return true;
        else return false;
        
        
    }
}