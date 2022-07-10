class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<HashMap<Character,Integer>,ArrayList<String>>bigMap=new HashMap<>();
        for(String string:strs)
        {
            HashMap<Character,Integer> fmap=new HashMap<>();
            for(int i=0;i<string.length();i++)
            {
                char ch=string.charAt(i);
                fmap.put(ch,fmap.getOrDefault(ch,0)+1);
            }
            if(bigMap.containsKey(fmap)==false)
            {
                ArrayList<String> list=new ArrayList<>();
                list.add(string);
                bigMap.put(fmap,list);
            }
            else{
                ArrayList<String> list=bigMap.get(fmap);
                list.add(string);
            }
        }
        List<List<String>> res=new ArrayList<>();
        for(ArrayList<String> val:bigMap.values())
        {
            res.add(val);
        }
        return res;
        
    }
}