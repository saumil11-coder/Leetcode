class Solution {
  private  int []   months = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    public int helper(String s)
    {
        int m=s.charAt(1)-'0'+10*(s.charAt(0)-'0'); //months
           int d=s.charAt(4)-'0'+10*(s.charAt(3)-'0'); //days  
        --m;
        while(m>0)
        {
            d+=months[m];
            --m;
            
            
        }
        return d;
    }
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
     int a1 = helper(arriveAlice), a2 = helper(leaveAlice), b1 = helper(arriveBob), b2 = helper(leaveBob);
       
       int ans = 0;
        for (int i = 0; i < 370; ++i) {
            if (a1 <= i && i <= a2 && b1 <= i && i <= b2) {
                ++ans;
            }
        }
        return ans;
            
        
        

    }
}