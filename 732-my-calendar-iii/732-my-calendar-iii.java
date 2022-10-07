class MyCalendarThree {
    TreeMap<Integer,Integer> tm;

    public MyCalendarThree() {
        tm = new TreeMap<>();
    }
    
    public int book(int start, int end) {
        tm.put(start, tm.getOrDefault(start,0)+1);
        tm.put(end, tm.getOrDefault(end,0)-1);
        int k =0;
        int ongoing =0;
        for(int val:tm.values()){
            k= Math.max(k,ongoing+=val);
        }
        return k;
    }
}