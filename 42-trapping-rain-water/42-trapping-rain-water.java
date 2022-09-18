class Solution {
    public int trap(int[] height) {
      int water=0; int n=height.length;
        int left[]=new int[n];
        int right[]=new int[n];
        left[0]=height[0];
        right[0]=height[0];
       
        for(int i=1;i<n;i++)
        {
           if(height[i]>left[i-1])
           {
               left[i]=height[i];
           }
            else{
                left[i]=left[i-1];
            }
        }
         for(int i=n-1;i>=0;i--)
        { if(i==n-1)
            right[i] = height[i];
            else if(height[i]>right[i+1])
           {
               right[i]=height[i];
           }
            else{
                right[i]=right[i+1];
            }
        }
        for(int i =0;i<n-1;i++)
        {
            water+=Math.min(left[i],right[i])-height[i];
        }
        
        return water;
    }
}