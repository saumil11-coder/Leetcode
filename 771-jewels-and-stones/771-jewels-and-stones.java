class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        var set=new HashSet<Character>();
        for(Character c:jewels.toCharArray())
        {
            set.add(c);
        }
        int count=0;
        for(Character c:stones.toCharArray())
        {
            if(set.contains(c))
                count++;
        }
        return count;
    }
}