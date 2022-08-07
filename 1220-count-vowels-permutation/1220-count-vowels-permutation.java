class Solution {
    public int countVowelPermutation(int n) {
        
		// long dp of length n used to handle big test cases and using mod efficiently
        long []dp = new long[n];
        long mod = (long)1e9+7;
		// base case
        long ia = 1,ie = 1,ii = 1,io = 1,iu = 1; 
        dp[0] = 5;
        
        for( int i=1; i<n; i++ ){
			// simply calculating current strings of length i by using previous string and current options values
            long tot = ((ia*1) + (ie*2) + (ii*4) + (io*2) + (iu*1))%mod;
            
			// finding out new values of strings ending with a specific character by using previous values
            long na = (ie+ii+iu)%mod;
            long ne = (ia + ii)%mod;
            long ni = (ie + io)%mod;
            long no = ii%mod;
            long nu = (ii+io)%mod;
            
            
            ia = na;
            ie = ne;
            ii = ni;
            io = no;
            iu = nu;
            
			// assigning value to dp
            dp[i] = tot;
        }
        
        return (int)dp[n-1];
    }
}