class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int inicolor=image[sr][sc];
        int ans[][]=image;
        int []delrow={-1,0,1,0};
        int []delcol={0,1,0,-1};
        dfs(image,sr,sc,color,inicolor,ans,delrow,delcol);
        return ans;
        
    }
    public void dfs(int image[][],int sr,int sc,int color,int inicolor,int ans[][],int delrow[],int delcol[])
    {
        ans[sr][sc]=color;
        int n=image.length;
        int m=image[0].length;
        for(int i=0;i<4;i++)
        {
            int nrow=sr+delrow[i];
            int ncol=sc+delcol[i];
            if(nrow>=0 && nrow<n && ncol>=0 && ncol<m && image[nrow][ncol]==inicolor && ans[nrow][ncol]!=color)
            {
                  dfs(image,nrow,ncol,color,inicolor,ans,delrow,delcol);
            }
        }
    }
}