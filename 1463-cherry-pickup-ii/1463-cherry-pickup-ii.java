class Solution {

    // public int helper(int i, int j1, int j2, int[][] mat, int m, int n, int[][][] dp) //memoization
    // {
    //     if (j1 < 0 || j1 >= n || j2 < 0 || j2 >= n) {
    //         return (int) Math.pow(-10, 9);
    //     }
    //     if (i == m - 1) {
    //         if (j1 == j2) return mat[i][j1]; else {
    //             return mat[i][j1] + mat[i][j2];
    //         }
    //     }
    //     if (dp[i][j1][j2] != -1) return dp[i][j1][j2];
    //     int maxi = Integer.MIN_VALUE;
    //     for (int di = -1; di <= 1; di++) {
    //         for (int dj = -1; dj <= 1; dj++) {
    //             int ans;
    //             if (j1 == j2) ans = mat[i][j1] + helper(i + 1, j1 + di, j2 + dj, mat, m, n, dp); else {
    //                 ans = mat[i][j1] + mat[i][j2] + helper(i + 1, j1 + di, j2 + dj, mat, m, n, dp);
    //                 maxi = Math.max(maxi, ans);
    //             }
    //         }
    //     }
    //     return dp[i][j1][j2] = maxi;
    // }

    public int cherryPickup(int[][] grid) { // tabulation 
        int n = grid.length;
        int m = grid[0].length;
        int front[][]=new int[m][m];
        int curr[][]=new int[m][m];
        for (int j1 = 0; j1 < m; j1++) {
            for (int j2 = 0; j2 < m; j2++) {
                if (j1 == j2) front[j1][j2] = grid[n - 1][j1]; else front[j1][j2] = grid[n - 1][j1] + grid[n - 1][j2];
            }
        }

        for (int i = n - 2; i >= 0; i--) {
            for (int j1 = 0; j1 < m; j1++) {
                for (int j2 = 0; j2 < m; j2++) {
                    int maxi = Integer.MIN_VALUE;
                    for (int di = -1; di <= 1; di++) {
                        for (int dj = -1; dj <= 1; dj++) {
                            int ans;

                            if (j1 == j2) ans = grid[i][j1]; else ans = grid[i][j1] + grid[i][j2];

                            if ((j1 + di < 0 || j1 + di >= m) || (j2 + dj < 0 || j2 + dj >= m)) ans += (int) Math.pow(-10, 9); else ans += front[j1 + di][j2 + dj];

                            maxi = Math.max(ans, maxi);
                        }
                    }
                    curr[j1][j2] = maxi;
                }
            }
            for(int a=0;a<m;a++)
            {
                front[a]=(int[])(curr[a].clone());
            }
        }

        return front[0][m - 1];
    }
}
