class Solution {
    public int equalSubstring(String s, String t, int maxCost) {
        int sum=0;
        int j=0; int ans=0;
        for(int i=0;i<s.length();i++)
        {
            sum+=Math.abs(s.charAt(i)-t.charAt(i));
            if(sum<=maxCost)
            { 
                ans=Math.max(ans,i-j+1);
            }
            else{
                sum-=Math.abs(s.charAt(j)-t.charAt(j));
                j++;
            }
            
        }
        return ans;
    }
}