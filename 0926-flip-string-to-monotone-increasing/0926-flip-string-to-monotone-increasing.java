class Solution {
    public int minFlipsMonoIncr(String s) {
        // Initialize variables to store the minimum number of flips and the number of flips currently needed
        int ans = 0, noOfFlip = 0;
        
        // Iterate through each character in the input string
        for(int i =0; i < s.length(); i++){
            // If the current character is a '0', update the minimum number of flips and add 1 to the current number of flips
            if(s.charAt(i) == '0') ans = Math.min(noOfFlip,ans+1);
            // If the current character is a '1', increment the number of flips
            else noOfFlip++;
        }
        // Return the minimum number of flips
        return ans;
    }
}