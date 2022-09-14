class Solution {
    public int numOfPairs(String[] nums, String target) {
        HashMap<String,Integer> mp=new HashMap<>();
        for(int i=0;i<nums.length;i++)
        {
            mp.put(nums[i],mp.getOrDefault(nums[i],0)+1);
        }
        int count=0;
        String a="";
        String b="";
        for(int i=0;i<target.length();i++)
        {
            a=target.substring(0,i);
            b=target.substring(i,target.length());
            if(mp.containsKey(a) && mp.containsKey(b))
            {
                if(a.equals(b)) count+=mp.get(a) * (mp.get(a)-1);
                 else count+=mp.get(a)*mp.get(b);
                
            }
           
        }
        return count;
        
    }
}
