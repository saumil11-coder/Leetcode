class Solution
{
    public int numDecodings(String s)
    {
        if(s.charAt(0)=='0')
            return 0;
        int l=s.length();
        int[] dp=new int[l+1];
        dp[l-1]=s.charAt(l-1)=='0'? 0:1;
        dp[l]=1;
        
        for(int i=l-2;i>=0;i--)
        {
            switch(s.charAt(i))
            {
                case '0':
                    continue;
                case '1':
                    dp[i]=dp[i+1]+dp[i+2];
                    break;
                case '2':
                    if(s.charAt(i+1)>='0' && s.charAt(i+1)<='6')
                        dp[i]=dp[i+1]+dp[i+2];
                    else
                        dp[i]+=dp[i+1];
                    break;
                default:
                    dp[i]+=dp[i+1];
            }
        }
        return dp[0];
    }
}