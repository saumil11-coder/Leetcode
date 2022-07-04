class Solution {
    public int candy(int[] ratings) {
        int distribution[]=new int[ratings.length];
        Arrays.fill(distribution,1);
        for(int i=0;i<ratings.length-1;i++)
        {
            if(ratings[i+1]>ratings[i])
            {
                distribution[i+1]=distribution[i]+1;
            }
        }
        for(int i=ratings.length-1;i>0;i--)
        {
            if(ratings[i-1]>ratings[i])
                
            {
                if(distribution[i-1]<=distribution[i])
                {
                    distribution[i-1]=distribution[i]+1;
                }
            }
        }
        int candies=0;
        for(int i=0;i<ratings.length;i++)
        {
            candies+=distribution[i];
        }
        return candies;
    }
}