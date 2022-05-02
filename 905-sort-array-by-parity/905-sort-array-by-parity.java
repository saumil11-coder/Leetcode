class Solution {
 public int[] sortArrayByParity(int[] nums) {
int i=0;
int j=0;
while(j<nums.length)
{
if(nums[j]%2==0)
{
swap(nums,i,j);
i++;j++;
}
else j++;
}
return nums;
        
}
private void swap(int nums[],int i,int j)
{
int temp=nums[i];
nums[i]=nums[j];
nums[j]=temp;
}
}