class RandomizedSet {
HashMap<Integer,Integer> hs;
    List<Integer> list;
    public RandomizedSet() {
        hs=new HashMap<>();
        list=new ArrayList<>();
    }
    
    public boolean insert(int val) {
        if(hs.containsKey(val))
            return false;
        list.add(val);
        hs.put(val,list.size()-1);
        return true;
    }
    
    public boolean remove(int val) {
        if(hs.containsKey(val)==false)
        {
            return false;
        }
        int idx=hs.get(val);
        Collections.swap(list,idx,list.size()-1);
        int swappedWith=list.get(idx);
        hs.put(swappedWith,idx);
        list.remove(list.size()-1);
        hs.remove(val);
        return true;
        
    }
    
    public int getRandom() {
        Random random=new Random();
        int n=random.nextInt(list.size());
        return list.get(n);
        
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */