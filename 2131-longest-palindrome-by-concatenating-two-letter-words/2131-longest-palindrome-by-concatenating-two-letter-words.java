class Solution {
    public int longestPalindrome(String[] words) {
        HashMap<String,Integer> map = new HashMap<>();
        int count = 0;
        for(String s : words){
            map.put(s,map.getOrDefault(s,0)+1);
        }
        int ans = 0;
        for(Map.Entry<String,Integer> e : map.entrySet()){
            String s = e.getKey();
            String st = s.charAt(1) + "";
            st += s.charAt(0);
            if(s.equals(st)){
                ans += 4*(e.getValue() / 2);
                map.put(s,map.get(s) -2);
                if(e.getValue() % 2 != 0) count = 2;
            }
            else if(map.get(s) > 0 && map.containsKey(st) && map.get(st) > 0 ){
                int x = Math.min(e.getValue(),map.get(st));
                ans += 2*x;
            }
        }
        return ans + count;
    }
}