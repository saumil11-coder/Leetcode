class Solution {
    static void reverse(int l,int h,char s[])
    {
        if(l>h)
        {
            return ;
        }
        char c=s[l];
        s[l]=s[h];
        s[h]=c;
        reverse(l+1,h-1,s);
    }
    public void reverseString(char[] s) {
        reverse(0,s.length-1,s);
    }
}