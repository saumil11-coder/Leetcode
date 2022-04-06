class Solution {
public int threeSumMulti(int[] arr, int target) {
     int mod=1_000_000_007;
long result=0;
for(int i=0;i<arr.length;i++)
{int count[]=new int[101];
for(int j=i+1;j<arr.length;j++)
{
int k=target-arr[i]-arr[j];
if(k>=0&&k<=100&&count[k]>0)
{
result+=count[k];
result%=mod;
}
count[arr[j]]++;
}
}
return (int)result;
}
}