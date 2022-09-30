class Solution {
    public List<List<Integer>> getSkyline(int[][] buildings) {
        var m = new TreeMap<Integer, Integer>();
        var pm = m;
        for(int[] b : buildings) {
            m.put(b[0], b[2]); 
            m.put(b[1], 0);    
        }
        
        for(var e : m.entrySet()) {
            int maxH = e.getValue();
            int pos = e.getKey();
            for(int[] b : buildings) {
                if(pos < b[0]) break;
                if(pos < b[1] && maxH < b[2]) maxH = b[2];
            }
            pm.put(pos, maxH);
        }
        
        var result = new ArrayList<List<Integer>>();
        int prevH = 0;
        for(var e : pm.entrySet()) {
            int h = e.getValue();
            int pos = e.getKey();
            if(h != prevH) {
                result.add(new ArrayList(Arrays.asList(pos, h)));
                prevH = h;
            }
        }
        
        return result;
    }
}