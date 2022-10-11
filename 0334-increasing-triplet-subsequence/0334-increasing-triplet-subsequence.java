class Solution {
    public boolean increasingTriplet(int[] nums) {
        int small=Integer.MAX_VALUE;
        int secondSmall=Integer.MAX_VALUE;
        for(int i:nums)
        {
            if(i<=small) small=i;
            else if(i<=secondSmall) secondSmall=i;
            else return true;
        }return false;
    }
}