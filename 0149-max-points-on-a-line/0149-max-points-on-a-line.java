class Solution {
    public int gcdUtil(int p,int q)
    {
        if(q==0)return p;
        int r=p%q;
        return gcdUtil(q,r);
    }
    public int maxPoints(int[][] points) {
        if(points.length<2)
            return points.length;
        int n=points.length;
        Map<String,Integer> mp =new HashMap<>();
        int maxPoints=0;
        int curMax,verticalPoints,overlapPoints;
        for(int i=0;i<n;i++)
        {
            curMax=verticalPoints=overlapPoints=0;
            for(int j=i+1;j<n;j++)
            {
                if(points[i][0]==points[j][0] && points[j][1]==points[i][1])
                    overlapPoints++;
                else if(points[i][0]==points[j][0]) verticalPoints++;
                else{
                    int xPair=points[j][0]-points[i][0];
                    int yPair=points[j][1]-points[i][1];
                    int gcd=gcdUtil(xPair,yPair);
                    xPair/=gcd;
                    yPair/=gcd;
                    String Pair=(yPair)+" "+(xPair);
                    if(!mp.containsKey(Pair)) mp.put(Pair,0);
                    mp.put(Pair,mp.get(Pair)+1);
                    curMax= Math.max(curMax,mp.get(Pair));
                }
                curMax=Math.max(curMax,verticalPoints);
            }
            maxPoints=Math.max(maxPoints,curMax+overlapPoints+1);
            mp.clear();
        }
        return maxPoints;
    }
}