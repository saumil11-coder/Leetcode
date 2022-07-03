class Solution {
    public void wiggleSort(int[] nums) {
        Arrays.sort(nums);
        int n=nums.length;
        int res[]=new int[n];
        int i=1;
        int j=n-1;
        while(i<n)
        {
            res[i]=nums[j];
            i+=2;
            j--;
        }
        i=0;
        while(i<n){
            res[i]=nums[j];
            i+=2;
            j--;
        }
        for( i=0;i<n;i++)
        {
            nums[i]=res[i];
        }
    }
}