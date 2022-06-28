class Solution {
    public int minDeletions(String s) {
        int deletion=0;
        int freq[]=new int[26];
        for(char c:s.toCharArray())
        {
            freq[c-'a']++;
        }
        Set<Integer> hs=new HashSet<>();
        for(int count:freq)
        {
        while(count>0&&hs.contains(count))
            {
                deletion++;
                count--;
            }
            hs.add(count);
        }
        return deletion;
    }
}