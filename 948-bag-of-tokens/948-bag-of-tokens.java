class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        int n=tokens.length;
        int left=0;
        int right=n-1;
        int scores=0;
        Arrays.sort(tokens);
        for(int i=0;i<n;i++)
        {
            if(power>=tokens[left])
            {
                power-=tokens[left++];
                scores++;
            }
            else{
                if(power+tokens[right]>=tokens[left] && scores!=0 && left!=right)
                {
                    power+=tokens[right--];
                    scores--;
                }
                else break;
            }
        }
        return scores;
        
    }
}