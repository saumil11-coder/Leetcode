class Solution {
    public int numberOfSubstrings(String s) {
        HashMap<Character ,Integer> mp=new HashMap<>();
        int j=0,count=0;
        for(int i=0;i<s.length();i++)
        {
            mp.put(s.charAt(i),mp.getOrDefault(s.charAt(i),0)+1);
        
            while(mp.size()==3)
            {
                count+=s.length()-i;
                mp.put(s.charAt(j),mp.get(s.charAt(j))-1);
                if(mp.get(s.charAt(j))==0) mp.remove(s.charAt(j));
                j++;
            }
            
        }
        return count;
        
    }
}