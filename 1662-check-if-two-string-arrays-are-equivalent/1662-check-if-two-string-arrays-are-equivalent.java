class Solution {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder sb1=new StringBuilder();
        StringBuilder sb2=new StringBuilder();
        String str1="";
         String str2="";
        for(String s: word1)
        {
            sb1.append(s);
        } str1=sb1.toString();
        for(String s:word2)
        {
            sb2.append(s);
        }str2=sb2.toString();
        if(str1.length()>str2.length() || str2.length()>str1.length())
            return false;
     // if(sb1.toString().equals(sb2.toString()))
     //     return true;
     //    else return false; 
        // System.out.println(str1);
        // System.out.println(str2);
        int count=0;
        for(int i=0;i<str2.length();i++)
        {
            if(str1.charAt(i)!=str2.charAt(i))
                count++;
            
        }
        if(count>0) return false;
        else return true;

        
    }
}