class Solution {
    private boolean checkValid(char[] ch)
    {
         boolean []flag=new boolean[9];
        for(int i=0;i<9;i++)
        {
            if(ch[i]=='.')continue;
            if(flag[ch[i]-'0'-1])
                return false;
           	flag[ch[i]-'0'-1]=true;
        }
        return true;
    }
    public boolean isValidSudoku(char[][] board) {
        char [] ch = new char[9];
        int two[][] = {{0,0},{0,1},{0,2},{1,0},{1,1},{1,2},{2,0},{2,1},{2,2}};
        for(int i=0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {
                ch[j] = board[i][j];
            }
            if(!checkValid(ch))
    			return false;
        }
        for(int i=0;i<9;i++)
        {
            for(int j=0;j<9;j++)
            {
                ch[j] = board[j][i];
            }
            	if(!checkValid(ch))
    			return false;
        }
        for(int k=0;k<two.length;k++)
        {
            for(int i= two[k][0]*3, icount=0; icount<3;i++,icount++)
            {
                for(int j = two[k][1]*3, jcount=0; jcount<3;j++, jcount++)
                {
                    ch[icount*3+jcount]=board[i][j];
                }
            }
            if(!checkValid(ch))
    		
                return false;
        }
        return true;
        
        
    }
}