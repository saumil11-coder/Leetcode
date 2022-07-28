class Solution {
    public int numRabbits(int[] answers) {
        int map[]=new int[1000];
        int res=0;
        for(int i:answers)
        {
            map[i]++;
        if(map[i]==i+1)
        {
            res+=i+1;
            map[i]=0;
        }
        }
            for(int i=0;i<map.length;i++)
            {
                if(map[i]>0)
                {
                    res+=i+1;
                }
            }
        return res;
    }
}