class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> ans=new ArrayList<>();
        String p=normalize(pattern);
        for(String word:words)
        {
            if(p.equals(normalize(word)))
            {
                ans.add(word);
            }
        }
        return ans;
        
    }
    public String normalize(String s)
    {
        HashMap<Character , Integer> mp =new HashMap<>();
        String ans="";
        for(int i=0;i<s.length();i++)
        {
            mp.putIfAbsent(s.charAt(i),mp.size());
            ans+=mp.get(s.charAt(i));
        }
        return ans;
    }
}