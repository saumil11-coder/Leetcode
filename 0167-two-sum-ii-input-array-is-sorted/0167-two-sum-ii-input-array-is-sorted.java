class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int start=0;
        int sum=0;
        int result[]=new int[2];
        int end=numbers.length-1;
        while(start<end)
        {  
             sum=numbers[end]+numbers[start];
             if(sum==target)
             {
                 result[0]=start+1;
                 result[1]=end+1;
             }
             if(sum<target)
            {
                start++;
            }
            else end--;
        }
        return result;
        
    }
}