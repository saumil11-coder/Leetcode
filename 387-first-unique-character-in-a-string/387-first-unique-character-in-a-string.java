class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character ,Integer> characterhashTable=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            char character=s.charAt(i);
            // .put(ch,characterhashTable.getOrDefault(ch,0)+1);
        characterhashTable.put(character,characterhashTable.getOrDefault(character,0)+1);

            
        }
        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(characterhashTable.get(ch)==1)return i;
        }
        return -1;
        
    }
}