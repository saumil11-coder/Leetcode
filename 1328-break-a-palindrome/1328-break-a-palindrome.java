class Solution {
    public String breakPalindrome(String palindrome) {
        char[] arr = palindrome.toCharArray();
        int n = arr.length;
        if(n==1)
            return "";
        for(int i=0;i<n;i++){
            if((n&1) == 1 && i == n/2) continue;
            if(arr[i] > 'a' ){
                arr[i] = 'a';
                return new String(arr);
            }
        }
        arr[n-1] = 'b';
        return new String(arr);
    }
}