class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
            return false;
        char sArray[]=s.toCharArray();
        char tArray[]=t.toCharArray();
        Arrays.sort(sArray);
        Arrays.sort(tArray);
        for(int i=0;i<s.length();i++)
        {
            if(sArray[i]!=tArray[i])return false;
        }
        return true;
        
    }
}