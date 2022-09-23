class Solution {
    public int concatenatedBinary(int n) {
        long ans = 0;
        int bit_count = 0;
        for(int i=1; i<=n; i++){
            if((i&(i-1))  == 0)
                bit_count++;
            
            ans = ((ans << bit_count) | i)%1000000007;
        }
        return (int)ans;
    }
}