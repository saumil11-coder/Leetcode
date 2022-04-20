class Solution {
    public boolean checkIfPangram(String sentence) {
        Set<Character> hs=new HashSet<>();
        for(Character c:sentence.toCharArray())
        {
            if(!hs.contains(c))
                hs.add(Character.toLowerCase(c));
        }
        return(hs.size()==26);
        
    }
}