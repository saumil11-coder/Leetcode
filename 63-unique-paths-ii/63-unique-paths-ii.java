// class Solution {
//     public int helper(int i,int j,int mat[][],int dp[][])
//     {
//         if(i>=0 && j>=0 && mat[i][j]==1) return 0;
//         if(i==0 && j==0)return 1;
//         if(i<0 || j<0) return 0;
//         if(dp[i][j]!=-1)return dp[i][j];
//         int up=helper(i-1,j,mat,dp);
//         int left=helper(i,j-1,mat,dp);
//         return dp[i][j]=up+left;
        
//     }
//     public int uniquePathsWithObstacles(int[][] obstacleGrid) {
//         int m=obstacleGrid.length;
//         int n=obstacleGrid[0].length;
//         int dp[][]=new int[m][n];
//         for(int []rows : dp)
//         {
//             Arrays.fill(rows,-1);
//         }
//         return helper(m-1,n-1,obstacleGrid,dp);
        
//     }
// }




//tabulation
class Solution{
   public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m=obstacleGrid.length;
        int n=obstacleGrid[0].length;
        int dp[][]=new int[m][n];
        for(int i = 0 ; i < m ; i++)
            for(int j = 0 ; j < n ; j++)
                dp[i][j] = -1;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
               
                 if(obstacleGrid[i][j] == 1) 
                    dp[i][j] = 0;
                else if(i == 0 && j == 0)    
                    dp[i][j] = 1;
                 else{   int up=0; int left=0;
                    if(i>0)up=dp[i-1][j];
                    if(j>0)left=dp[i][j-1];
                    dp[i][j]=up+left;
                     }
                
            }
        }
       return dp[m-1][n-1];
        
    }
}