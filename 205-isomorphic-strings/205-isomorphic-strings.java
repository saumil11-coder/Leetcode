class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length())return false;
        HashMap<Character,Character> mp1=new HashMap<>();
        HashMap<Character,Boolean> mp2=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            char s1=s.charAt(i);
            char t1=t.charAt(i);
            if(mp1.containsKey(s1)==true){
                if(mp1.get(s1)!=t1)
                {
                    return false;
                }
            }
            else{
                if(mp2.containsKey(t1)==true)
                {
                    return false;
                }
                else{
                    mp1.put(s1,t1);
                    mp2.put(t1,true);
                }
            }
        }
        return true;
        
        
    }
}