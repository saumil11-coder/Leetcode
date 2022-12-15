class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        // if(text1.length() > text2.length()){
        //     
        // }else{
        //     int dp[][] = new int[text2.length][text1.length];
        // }
        int dp[][] = new int[text1.length() + 1][text2.length() + 1];
        for(int i = 0 ; i < dp.length ; i++){
            for(int j = 0 ; j < dp[0].length ; j++){
                if(i == 0 || j == 0){
                    dp[i][j] = 0;
                }else if(text1.charAt(i -1 ) == text2.charAt(j - 1)){
                    dp[i][j] = dp[i- 1][j - 1] + 1;
                }else{
                    dp[i][j] = Math.max(dp[i][j-1], dp[i-1][j]);
                }
            }
        }
        // for(int i = 0 ; i < dp.length ; i++){
        //     for(int j = 0 ; j < dp[0].length ; j++){
        //         System.out.print(dp[i][j] + " ");
        //     }
        //     System.out.println();
        // }
        return dp[text1.length()][text2.length()];
    }
}
