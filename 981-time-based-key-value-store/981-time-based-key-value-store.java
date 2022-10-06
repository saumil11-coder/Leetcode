class TimeMap {
    HashMap<String,HashMap<Integer,String>> map;
    public TimeMap() {
        map=new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        if(map.containsKey(key)){
            map.get(key).put(timestamp,value);
        }else{
            HashMap<Integer,String> inner=new HashMap<>();
            inner.put(timestamp,value);
            map.put(key,inner);
        }
    }
    
    public String get(String key, int timestamp) {
        if(map.get(key)==null) return "";
        String ans=map.get(key).get(timestamp);
        if(ans!=null) return ans;
        for(int i=timestamp-1;i>=1;i--){
            ans=map.get(key).get(i);
            if(ans!=null) return ans;
        }
        return "";
    }
}
