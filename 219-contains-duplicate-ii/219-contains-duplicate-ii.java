class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
     HashMap<Integer,Integer> hs=new HashMap<>();
int lastSeen;
for(int i=0;i<nums.length;i++)
{
if(hs.containsKey(nums[i]))
{
lastSeen=hs.get(nums[i]);
if(Math.abs(lastSeen-i)<=k)
return true;
else
hs.put(nums[i],i);
}
else{
hs.put(nums[i],i);
}
}
return false;
    }
}