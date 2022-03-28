class RandomizedSet {
    List<Integer> ls;
    
HashMap<Integer ,Integer> hs;

    public RandomizedSet() {
    hs=new HashMap<>();
    ls=new ArrayList<>();

        
        
        
    }
    
    public boolean insert(int val) {
        if(hs.containsKey(val))
        {
            return false;
        }
        ls.add(val);
        hs.put(val,ls.size()-1);
        return true;
        
    }
    
    public boolean remove(int val) {
       if(!hs.containsKey(val)) {
            return false;
        }else {
            int key = hs.get(val);
            int lastElement = ls.get(ls.size() - 1);
            hs.put(lastElement, key);
            ls.set(key, lastElement);
            hs.remove(val);
            ls.remove(ls.size() - 1);
            return true;
        }
    }
    
    
    public int getRandom() {
          Random random = new Random();
        return ls.get( random.nextInt(ls.size()) );
        
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */