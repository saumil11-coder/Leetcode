class Solution {
    public boolean makesquare(int[] matchsticks) {
        int sum = 0;
        for (int matchstick : matchsticks)
            sum += matchstick;
        
        if (sum % 4 != 0) // The four sides cannot be equal
            return false;
        
        int sideLen = sum / 4;
        int[] sides = new int[] {sideLen, sideLen, sideLen, sideLen};
        
        Arrays.sort(matchsticks); // Always try longer matchstick first
        return helper(matchsticks, sides, matchsticks.length - 1); // idx starts from right to left
    }
    
    private boolean helper(int[] matchsticks, int[] sides, int idx) {
        if (idx == -1) // use up matchstick
            return allZero(sides);
        
        for (int i = 0; i < sides.length; i++) { // for each matchstick, try four sides
            if (matchsticks[idx] <= sides[i]) {
                sides[i] -= matchsticks[idx];
                if(helper(matchsticks, sides, idx - 1))
                    return true;
                sides[i] += matchsticks[idx]; // backtrack
            }
        }
        
        return false;
    }
    
    private boolean allZero(int[] sides) {
        for (int i = 0; i < sides.length; i++) {
            if (sides[i] > 0)
                return false;
        }
        return true;
    }
}