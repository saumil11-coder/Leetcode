class Solution {
  public int minimumEffortPath(int[][] heights)
        {
            int rows = heights.length;
            int cols = heights[0].length;
            int[][] dp = new int[rows][cols];
            int[][] dir = { { 0, 1 }, { 1, 0 }, { 0, -1 }, { -1, 0 } };

            //Fill with infinity to relax the nodes later
            for (int[] row: dp)
            Arrays.fill(row, Integer.MAX_VALUE);

            dp[0][0] = 0;

            //This flag is used to check if the answer was found early. This happens when the shortest path is found in few iterations
            //and all shortest paths to nodes dont relax anymore. Without this flag you will get TLE
            var relaxAtleastOneEdge = true;

            //Relax each edge (total nodes - 1) times
            for (int e = 0; e < (rows * cols) - 1 && relaxAtleastOneEdge; e++)
            {
                relaxAtleastOneEdge = false;

                //Loop through all graph edges
                for (int i = 0; i < rows; i++)
                {
                    for (int j = 0; j < cols; j++)
                    {
                        //Move in 4 directions as given in problem
                        for (int k = 0; k < 4; k++)
                        {
                             var newI = i+dir[k][0];
							 var newJ = j+dir[k][1];
                        
							if(newI < 0 || newI >= rows || newJ < 0 || newJ >= cols || dp[i][j] >= dp[newI][newJ])
								continue;
							
                            var absDiff = Math.abs(heights[newI][newJ] - heights[i][j]);

                            //Relax a node
                            if (dp[newI][newJ] > Math.max(dp[i][j], absDiff))
                            {
                                dp[newI][newJ] = Math.max(dp[i][j], absDiff);
                                relaxAtleastOneEdge = true;
                            }
                        }
                    }
                }
            }

            return dp[rows - 1][cols - 1];
        }
}