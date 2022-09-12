class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> mp=new HashMap<>();
        for(Character ch:s.toCharArray())
        {
            mp.put(ch,mp.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(mp.get(ch)==1) return i;
        }
        return -1;
        
    }
}