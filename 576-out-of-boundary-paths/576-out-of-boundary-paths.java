class Solution {
    public int findPaths(int m, int n, int maxMove, int i, int j) {
        
        if(i<0 || j<0 || i>=m  || j>=n || maxMove==0) return 0;
        int mod = (int)1e9 + 7;
        
        long[][][]dp= new long[m][n][maxMove+1];
        
        for(long[] []row: dp){
            for(long [] col : row){
                Arrays.fill(col, -1);
            }
        }
        
        long ans = getAns(i, j ,m , n ,maxMove , dp ,mod);
        return (int)ans%mod;
    }
    
    public static long getAns(int i , int j , int r , int c , int max, long[][][]dp , int mod){
        if(i<0 || j<0 || i>=r  || j>=c) return 1;
        
        
        if(dp[i][j][max]!=-1) return dp[i][j][max];
        
        if(max==0){
            if(i<0 || j<0 || i>=r  || j>=c) return 1;
            return 0;
        }
        
        
        
        long up = getAns(i-1, j , r, c,max-1, dp ,mod)%mod;
        long down = getAns(i+1 , j, r, c, max-1, dp , mod)%mod;
        long rt = getAns(i, j+1 , r, c, max-1, dp , mod)%mod;
        long lft = getAns(i , j-1 , r, c, max-1, dp , mod)%mod;
        

        
        return dp[i][j][max]=(up+down+rt+lft)%mod;
        
        
    }
}