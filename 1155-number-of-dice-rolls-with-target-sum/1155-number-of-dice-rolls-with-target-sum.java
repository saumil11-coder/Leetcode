class Solution {
    private int mod = 1000000007;
    private int dp[][];
    public int numRollsToTarget(int n, int k, int target) {
        
        // sratergy: do a dfs
        
        dp = new int[n+1][target+1];
        
        for(int row[]: dp){
            Arrays.fill(row, -1);
        }
        
        return dice(n, k, 0, target, 0);
    }
    private int dice(int n, int k, int curr, int target, int ans){
        
        if(curr == target && n==0){ 
            return 1;
        }
        else if(n==0 || curr == target){ 
            return 0;
        }
        
        if(dp[n][curr] != -1) return dp[n][curr];
        
        ans = 0;
        
        for(int i=1; i<=k; i++){
            
            if(curr > target-i) break; 
            
            ans = (ans + dice(n-1, k, curr+i, target, ans))%mod;
            
        }
        
        dp[n][curr] = ans;
        
        return ans;
    }
}