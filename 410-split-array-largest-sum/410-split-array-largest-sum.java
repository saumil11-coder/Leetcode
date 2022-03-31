class Solution {
 int nums[];
public int splitArray(int nums[],int m)
{
this.nums=nums;
int low =0;
int high=0;
int min=Integer.MAX_VALUE;
for(int i=0;i<nums.length;i++)
{
low=Math.max(low,nums[i]);
high+=nums[i];
}
while(low<=high)
{
int mid=(low+high)/2;
if(clearOfchunks(mid,m))
{
min=Math.min(min,mid);
high=mid-1;
}
else
{
low=mid+1;
}
}
return min ;  }
private boolean clearOfchunks(int mid,int m)
{
int chunks=0;
int i=0;
while(i<nums.length)
{ int val=0;
while(i<nums.length&&nums[i]+val<=mid) 

val+=nums[i++];

chunks++;
}
return chunks<=m;
}
}