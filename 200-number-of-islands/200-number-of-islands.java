class Solution {
    class Pair{
int first;
int second;
public Pair(int first,int second)
{
	this.first=first;
	this.second=second;
}
}

public int numIslands(char[][] grid) {
    int cnt=0;
    int n=grid.length;
   int m =grid[0].length;
int vis[][]=new int[n][m];

for(int row=0;row<n;row++)
{
for(int col=0;col<m;col++)
{
if(vis[row][col]==0 && grid[row][col]=='1')
{
    
 cnt++;
bfs(row,col,grid,vis);
}
}
}
return cnt;
}
    
public void bfs(int ro,int co,char[][] grid,int vis[][])
{
vis[ro][co]=1;
Queue<Pair> queue=new LinkedList<Pair>();
queue.add(new Pair(ro,co));
int n=grid.length;
int m=grid[0].length;
int mat[][]={{-1,0},{0,-1},{0,1},{1,0}};
while(!queue.isEmpty())
{
	int row=queue.peek().first;
	int col=queue.peek().second;
	queue.remove();
	    
    for(int i=0;i<4;i++)
    {
		    
			int nrow=row+mat[i][0];
			int ncol=col+mat[i][1];

			if(nrow<n && nrow>=0 && ncol<m && ncol>=0 && vis[nrow][ncol]==0 && grid[nrow][ncol]=='1')

				{
					vis[nrow][ncol]=1;
					queue.add(new Pair(nrow,ncol));
                                    
				}
         

        
    }

}
}}
