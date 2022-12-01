class Solution:
    def halvesAreAlike(self, s: str) -> bool:
        vowels=['a','e','i','o','u','A','E','I','O','U']
        count1,count2=0,0
        a=len(s)//2
        print(a)
        for i in range(a):
            if s[i] in vowels:
                count1+=1
        for i in range(a,len(s)):
            if s[i] in vowels:
                count2+=1
        return count1==count2