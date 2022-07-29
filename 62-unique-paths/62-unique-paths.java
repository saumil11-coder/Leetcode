class Solution {
//     public int helper(int i,int j,int dp[][])
//     {
//         //base case
//         if(i==0 && j==0)return 1;
//         if(i<0 || j<0) return 0;
//         if(dp[i][j]!=-1)return dp[i][j];
//         //logic
//         int up=helper(i-1,j,dp);
//         int left=helper(i,j-1,dp);
//         return dp[i][j]=up+left;
        
//     }
    public int uniquePaths(int m, int n) {
       //tabulation 
        int dp[][]=new int[m][n];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(i==0 && j==0){ dp[i][j]=1; 
                                 continue;}
                else{
                    int up=0;
                    int left=0;
                    if(i>0) up=dp[i-1][j];
                    if(j>0)left=dp[i][j-1];
                    dp[i][j]=up+left;
                }
            }
        }
        return dp[m-1][n-1];
        
    }
}