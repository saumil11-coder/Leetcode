class Solution {
 public int findMaxForm(String[] strs, int m, int n) {
    int[][] max = new int[m + 1][n + 1];
    for (int i = 0; i < strs.length; i++) {
        String str = strs[i];
        
        int neededZero = 0;
        int neededOne = 0;
        for (int j = 0; j < str.length(); j++) {
            if (str.charAt(j) == '0') {
                neededZero++;
            } else {
                neededOne++;
            }
        }
        
        int[][] newMax = new int[m + 1][n + 1];
        
        for (int zero = 0; zero <= m; zero++) {
            for (int one = 0; one <= n; one++) {
                if (zero >= neededZero && one >= neededOne) {
                    int zeroLeft = zero - neededZero;
                    int oneLeft = one - neededOne;
                    newMax[zero][one] = Math.max(1 + max[zeroLeft][oneLeft], max[zero][one]);
                } else {
                    newMax[zero][one] = max[zero][one];
                }
            }
        }
        
        max = newMax;
    }
    return max[m][n];
}
}