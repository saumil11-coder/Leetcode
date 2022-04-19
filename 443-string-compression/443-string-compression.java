class Solution {
    public int compress(char[] chars) {
        int indexAns=0;
        int i=0;
        while(i<chars.length)
        {
            int j=i;
            while(j<chars.length&&chars[j]==chars[i])
            {
                j++;
            }
            chars[indexAns++]=chars[i];
        
        if(j-i>1)
        {
            String count=j-i+"";
            for(char c:count.toCharArray())
            {
                
                chars[indexAns++]=c;
            }
        }
       i=j;
    }
        return indexAns;
    }
}