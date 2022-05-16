class Solution {
    public int shortestPathBinaryMatrix(int[][] grid) {
        
    int[][] dir = {{1,1},{1,0},{0,1},{1,-1},{-1,1},{-1,0},{0,-1},{-1,-1}};
        Queue<int[]> map =new LinkedList<>();
        int rMax = grid.length;
        int cMax = grid[0].length;
        
        //if start point is blocked, return -1, otherwise give map the start point
        if(grid[0][0]==1) return -1; 
        
        //first two parameters are coordinates, third keep track of the distance
        map.offer(new int[] {0,0,1});
        
        while(!map.isEmpty()){
            //get current coordinates and distance travelled
            int[] location = map.poll();
            int r = location[0];
            int c = location[1];
            int distance = location[2];
            
            //return if reaches the destination
            if(r==rMax-1 && c==cMax-1) return distance;
            
            //search 8 directions for unexplored points around current point
            for(int[] d : dir){
                int r2 = r + d[0];
                int c2 = c + d[1];
                if(r2<rMax && r2>=0 && c2<cMax && c2>=0 && grid[r2][c2]==0){
                    //add unexplored point to map and increment distance by 1
                    map.offer(new int[] {r2,c2,distance+1});
					//set this point to 1 as explored
                    grid[r2][c2] = 1;
                }
            }
        }   
        // whole space searched, cannot reach destination
        return -1;
    }
}

