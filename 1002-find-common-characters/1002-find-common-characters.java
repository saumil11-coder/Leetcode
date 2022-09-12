class Solution {
    public List<String> commonChars(String[] words) {
        HashMap<Character, Integer> mp = new HashMap<>();
        for(Character i:words[0].toCharArray())
        {
            mp.put(i,mp.getOrDefault(i,0)+1);
        }
        for(int i=1;i<words.length;i++)
        {
            HashMap<Character,Integer> temp =new HashMap<>();
            for(int j=0;j<words[i].length();j++)
            {
                char c=words[i].charAt(j);
                if(mp.containsKey(c) && mp.get(c)>0){
                temp.put(c,temp.getOrDefault(c,0)+1);
                mp.put(c,mp.get(c)-1);
            }
        }
        mp=temp;
            if(mp.size()==0) break;
        }
        List<String> res =new ArrayList<>();
        for(Character c:mp.keySet())
        {
            for(int k=0;k<mp.get(c);k++)
            {
                res.add(""+c);
            }
        }
        return res;
        
    }
}