class Solution {
    public int climbStairs(int n) {
        int prev2=1;
        int prev=1;
        for(int i=2;i<=n;i++)
        {
            int curr=prev2+prev;
            prev2=prev;
            prev=curr;
        }
        return prev;
    }
}