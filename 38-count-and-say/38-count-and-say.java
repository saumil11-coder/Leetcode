class Solution {
    public String countAndSay(int n) {
          if(n==1) return "1";
        int counter=0;
        String s=countAndSay(n-1);
        StringBuilder res=new StringBuilder();
      
        for(int i=0;i<s.length();i++)
        {counter++;
            if(i==s.length()-1||s.charAt(i)!=s.charAt(i+1))
            {
                res.append(counter).append(s.charAt(i));
                counter=0;
            }
        }
        return res.toString();
    }
}