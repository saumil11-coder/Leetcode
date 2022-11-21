class Solution {
    public int calculate(String s) {
        int sum=0;
         int sign =1;
        Stack<Integer> st=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            if(Character.isDigit(s.charAt(i)))
            {
                int val=0;
                while(i<s.length() && Character.isDigit(s.charAt(i)))
                {
                    val=val*10+ (s.charAt(i)-'0'); i++;
                }
                i--;
                val*=sign;
                 sign=1;
                sum+=val;
            }
            else if(s.charAt(i)=='(')
            {
                st.push(sum);
                st.push(sign);
                sum=0;
                sign=1;
            }
            else if(s.charAt(i)==')')
            {
                sum*=st.pop();
                sum+=st.pop();
            }
            else if(s.charAt(i)=='-')
            {
                sign*=-1;
            }
        }
        return sum;
        
    }
}