class Solution {
    public boolean reorderedPowerOf2(int n) {
        int ans[]= buildFreqCount(n);
        int x=1;
        for(int i=0;i<31;i++)
        {
            if(Arrays.equals(ans,buildFreqCount(x)))
                return true;
            x<<=1;
        }
        return false;
        
        
    }
    public int[] buildFreqCount(int n)
    {
        int []freq=new int[10];
        while(n!=0)
        {
            freq[n%10]++;
            n/=10;
        }
        return freq;
    }
}