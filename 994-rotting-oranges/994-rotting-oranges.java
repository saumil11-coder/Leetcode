class Pair{
    int row;
    int col;
    int tm;
    public Pair(int _row,int _col,int _tm)
    {
        this.row=_row;
        this.col=_col;
        this.tm=_tm;
    }
}

class Solution {
    public int orangesRotting(int[][] grid) {
        Queue<Pair> queue=new LinkedList<>();
        int n=grid.length;
        int m=grid[0].length;
        int vis[][]=new int[n][m];
        int cntfresh=0;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(grid[i][j]==2)
                {
                    vis[i][j]=2;
                    queue.add(new Pair(i,j,0));
                }
                else {vis[i][j]=0;}
                if(grid[i][j]==1) cntfresh++;
            }
        }
        int cnt=0;
        int time=0;
          int [][] mat={{-1,0},{0,1},{1,0},{0,-1}};
        while(!queue.isEmpty())
        {
            int r=queue.peek().row;
            int c=queue.peek().col;
            int t=queue.peek().tm;
            time=Math.max(time,t);
            queue.remove();
          
            
            for(int i=0;i<4;i++){
                    int nrow=r+mat[i][0];
                    int ncol=c+mat[i][1];
                    if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && grid[nrow][ncol]==1)
                    {
                        queue.add(new Pair(nrow,ncol,t+1));
                        grid[nrow][ncol]=2;
                        cnt++;
                    }
                
            }
        }
        if(cnt!=cntfresh) return -1;
        return time;
        
        }
        
    }
