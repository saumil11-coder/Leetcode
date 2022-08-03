class Solution {
    public int helper(int i,int j,int n,int [][]matrix,int dp[][])
    {
        if(j<0 || j>=n) return (int)Math.pow(10,9);//for  preventing out of bound 
        if(i==0)return matrix[i][j];// once we reach the 1st row we will return element\
        if(dp[i][j]!=-1) return dp[i][j];
        int up=matrix[i][j]+helper(i-1,j,n,matrix,dp);
        int upleft=matrix[i][j]+helper(i-1,j-1,n,matrix,dp);
        int upright=matrix[i][j]+helper(i-1,j+1,n,matrix,dp);
        return dp[i][j]=Math.min(up,Math.min(upleft,upright));
    }
    public int minFallingPathSum(int[][] matrix) {
     int  m=matrix.length;
        int n=matrix[0].length;
        int dp[][]=new int[m+1][n+1];
        for(int []row:dp)
        {
            Arrays.fill(row,-1);
        }
        int maxi=Integer.MAX_VALUE;
        for(int j=0;j<n;j++)
        {
            int ans=helper(m-1,j,n,matrix,dp);
            maxi=Math.min(maxi,ans);
        }
        return maxi;
    }
}