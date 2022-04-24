class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> hs=new HashSet<>();
        while(n!=1)
        {
            int current =n;
            int sum=0;
            while(current!=0)
            {
                sum+=(current%10)*(current%10);
                current/=10;
            }
            if(hs.contains(sum)){
                return false;
            }
            hs.add(sum);
            n=sum;
            
        }
        return true;
        
    }
}