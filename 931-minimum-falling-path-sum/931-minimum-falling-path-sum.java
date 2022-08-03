class Solution {
    // public int helper(int i,int j,int n,int [][]matrix,int dp[][])
    // {//memo
    //     if(j<0 || j>=n) return (int)Math.pow(10,9);//for  preventing out of bound 
    //     if(i==0)return matrix[i][j];// once we reach the 1st row we will return element\
    //     if(dp[i][j]!=-1) return dp[i][j];
    //     int up=matrix[i][j]+helper(i-1,j,n,matrix,dp);
    //     int upleft=matrix[i][j]+helper(i-1,j-1,n,matrix,dp);
    //     int upright=matrix[i][j]+helper(i-1,j+1,n,matrix,dp);
    //     return dp[i][j]=Math.min(up,Math.min(upleft,upright));
    // }
    public int minFallingPathSum(int[][] matrix) {
     int  n=matrix.length;
        int m=matrix[0].length;
        int dp[][]=new int[n][m];
        
  for(int j=0;j<m;j++)
  {
      
      dp[0][j]=matrix[0][j];
  }
        for(int i=1;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                int up=0,left=0,right=0;
                 up=matrix[i][j]+dp[i-1][j];
             if(j-1>=0)    left=matrix[i][j]+dp[i-1][j-1];
                else left= matrix[i][j]+(int)Math.pow(10,9);

                if(j+1<m)  right=matrix[i][j]+dp[i-1][j+1];
                else right=matrix[i][j]+(int)Math.pow(10,9);
                 dp[i][j]=Math.min(up,Math.min(left,right));
                }
           
        }
        
        int mini=Integer.MAX_VALUE;
        for(int j=0;j<m;j++)
        {
            mini=Math.min(mini,dp[n-1][j]);
        }
        return mini;
    }
}