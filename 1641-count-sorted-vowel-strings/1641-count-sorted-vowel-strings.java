class Solution {
    int a=1,e=1,i=1,o=1,u=1;
    public int countVowelStrings(int n) {
        while(n>1)
        {
            a=a+e+i+o+u;
            e=e+i+o+u;
            i=i+o+u;
            o=o+u;
            u=(u);
            n--;
        }
        return a+e+i+o+u;
    }
}