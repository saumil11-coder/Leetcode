class Solution {
   
        public int search(int nums[],int target)
{
if(nums.length==0) return -1;
int low =0;
int high=nums.length-1;
while(low<=high){
int midpoint = low+(high-low)/2;
if(nums[midpoint]==target)
{
return midpoint;
}
if(nums[midpoint]>target)
high=midpoint-1;
if(nums[midpoint]<target)
low=midpoint+1;
}

return -1;
        
    }
}