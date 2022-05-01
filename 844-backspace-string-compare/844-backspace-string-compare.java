class Solution {
    public boolean backspaceCompare(String s, String t) {
        s=er(s);
        t=er(t);
        return s.equals(t);
    }
    public String er(String s){
        StringBuilder s1=new StringBuilder();
        int count=0;
        for(int i=s.length()-1;i>=0;i--)
        {
            if(s.charAt(i)=='#')
            {
                count++;
            }
            else if(count!=0)
             {
                 count--;
             }
            else s1.append(s.charAt(i));
        }
        return s1.toString();
    }
}