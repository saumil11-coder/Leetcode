class RandomizedSet {
HashMap<Integer, Integer> mp;
    List<Integer> list;
    public RandomizedSet() {
        mp = new HashMap<>();
        list = new ArrayList<>();
    }
    
    public boolean insert(int val) {
        if(mp.containsKey(val))
            return false;
        list.add(val);
        mp.put(val,list.size()-1);
        return true;
    }
    
    public boolean remove(int val) {
        if(mp.containsKey(val) == false) return false;
        int idx = mp.get(val);
        Collections.swap(list, idx, list.size()-1);
        int swappedWith = list.get(idx);
        mp.put(swappedWith, idx);
        list.remove(list.size()-1);
        mp.remove(val);
        return true;
        
    }
    
    public int getRandom() {
        Random random  = new Random();
        int n = random.nextInt(list.size());
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