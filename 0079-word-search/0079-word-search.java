class Solution {
    boolean [][] visited;
    int n,m;
    public boolean exist(char[][] board, String word) {
        n=board.length;
        m=board[0].length;
        visited=new boolean[n][m];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(board[i][j]==word.charAt(0)){
                    if(valid(i,j,0,board,word)){
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public boolean valid(int i,int j,int count,char [][] board,String word){
      
        if(i<0 || i>=n || j<0 || j>=m ){
            return false;
        }

       
        if(visited[i][j]){
            return false;
        }

   
        if(word.charAt(count)!=board[i][j]){
            return false;
        }


        if(count==word.length()-1){
            return true;
        }


       
        visited[i][j]=true;

        //inc count
        count++;

     
        if(valid(i+1,j,count,board,word) ||
           valid(i,j+1,count,board,word) ||
           valid(i-1,j,count,board,word) ||
           valid(i,j-1,count,board,word) ){
               return true;
           }
        
        //mark current cell unvisited
        visited[i][j]=false;
        
        return false;

    }

}