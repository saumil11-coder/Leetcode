class Solution {
    public int nearestValidPoint(int x, int y, int[][] points) {
       int min = Integer.MAX_VALUE;
        int count = -1;
        int i = 0;
        for (int[] p: points){
            int nx = p[0];
            int ny = p[1];
            if ((nx == x) || (ny == y)){
                int distance = Math.abs(nx-x) + Math.abs(ny-y);
                if (distance < min){ 
                    min = distance;
                    count = i;        
                }
            }
            i++;
        }
        return count;
        
    }
}