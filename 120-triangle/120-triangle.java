class Solution {
    public int helper(int i,int j,List<List<Integer>> lst,int n,int dp[][])
    {
        if(i==n-1)return lst.get(n-1).get(j);
        if(dp[i][j]!=-1) return dp[i][j];
        int down=lst.get(i).get(j)+helper(i+1,j,lst,n,dp);
        int diagonal=lst.get(i).get(j)+helper(i+1,j+1,lst,n,dp);
        return dp[i][j]= Math.min(down,diagonal);
    }
    public int minimumTotal(List<List<Integer>> triangle) {
        int n=triangle.size();
        int [][]dp=new int[n][n];
        for(int row[]:dp)
        Arrays.fill(row,-1);
        return helper(0,0,triangle,n,dp);
    }
}