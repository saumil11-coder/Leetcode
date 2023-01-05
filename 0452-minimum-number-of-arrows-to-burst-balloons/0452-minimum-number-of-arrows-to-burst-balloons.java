class Solution {

    public int findMinArrowShots(int[][] points) {
        if (points.length == 1) return 1;
        
Arrays.sort(points, (a, b) -> Long.compare(a[1], b[1]));

        for(int i=0;i<points.length;i++)
      {
          for(int j=0;j<points[0].length;j++)
          {
              System.out.println(points[i][j]);
          }
      }
        int i = 0;
        int j = 0;
        int count = 0;
        while (i < points.length) {
            j = i + 1;
            while (j < points.length) {
                if(points[i][1]>=points[j][0])
                    j++;
                else break;
                
            }
            count++; i=j;
        }
        return count;
    }
}
