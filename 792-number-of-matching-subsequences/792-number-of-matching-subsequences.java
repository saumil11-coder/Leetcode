class Solution {
    public int numMatchingSubseq(String s, String[] words) {
        int count=0;int m=s.length();
        Map<String,Integer> hm=new HashMap<>();
        for(String word:words)
        {
            hm.put(word,hm.getOrDefault(word,0)+1);
        }
        for(String subSequence : hm.keySet())
        {
            int i=0;int j=0; int n=subSequence.length();
            while(i<s.length() && j<n)
            {
                if(s.charAt(i)==subSequence.charAt(j))
                {
                    j++;
                }
                i++;
                if(j==n) count+=hm.get(subSequence);
            }
        }
        return count;
        
    }
}
