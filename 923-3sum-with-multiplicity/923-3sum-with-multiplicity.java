class Solution {
   public int threeSumMulti(int[] arr, int target) {
HashMap<Integer,Integer> hs=new HashMap<>();
int mod=1000000007;
int res=0;
for(int i=0;i<arr.length;i++)
{
res=(res+hs.getOrDefault(target-arr[i],0))%mod;
for(int j=0;j<i;j++)
{
int temp=arr[i]+arr[j];
hs.put(temp,hs.getOrDefault(temp,0)+1);
}
}
return res;
}
}