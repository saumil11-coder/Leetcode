class Solution {
    public int shortestSubarray(int[] nums, int k) {
       final int n=nums.length;
        int ans=n+1;
        ArrayDeque<Integer>  q=new ArrayDeque<>();
        long prefix[]=new long[n+1];
        for(int i=0;i<n;i++)
        {
            prefix[i+1]=(int)nums[i]+prefix[i];
        }

        for(int i=0;i<n+1;i++)
        {
            while(!q.isEmpty() && prefix[i]-prefix[q.getFirst()]>=k)
            {
                ans=Math.min(ans,i-q.pollFirst());
            }
            while(!q.isEmpty() && prefix[q.getLast()]>=prefix[i])
                q.pollLast();
            q.addLast(i);
        }
        return ans<=n?ans:-1;
    } 
}