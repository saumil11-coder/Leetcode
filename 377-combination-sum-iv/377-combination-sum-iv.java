class Solution {
    public int help(List<Integer> l,int target,int[] dp){
       if(target==0) return 1;
        if(target<0) return 0;
        if(dp[target]!=-1) return dp[target];
        int count =0;
        for(int i=0;i<l.size();i++){
           count+=help(l,target-l.get(i),dp);
        }
        
        return dp[target]=count;
    }
    public int combinationSum4(int[] nums, int target) {
        List<Integer> ans = new ArrayList<>();
        int dp[]=new int[1001];
        Arrays.fill(dp,-1);
        
    
        for(int iterator: nums )
        {
            ans.add(iterator);
        }
        
        return help(ans,target,dp);
    }
}