class Solution {
    public boolean equalFrequency(String word) {
        HashMap<Character,Integer> mp=new HashMap<>();
        for(int i=0;i<word.length();i++)
        {
            mp.put(word.charAt(i),mp.getOrDefault(word.charAt(i),0)+1);
        }
        for(int i=0;i<word.length();i++)
        {
            if(mp.get(word.charAt(i))==1)
                mp.remove(word.charAt(i));
            else mp.put(word.charAt(i),mp.get(word.charAt(i))-1);
            Set<Integer> set=new HashSet<>(mp.values());
            if(set.size()==1) return true;
                        mp.put(word.charAt(i),mp.getOrDefault(word.charAt(i),0)+1);

        }
         return false;
    }
        
    }
