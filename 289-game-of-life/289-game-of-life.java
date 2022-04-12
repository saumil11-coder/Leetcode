class Solution {
     public void gameOfLife(int[][] board) {
		for(int r = 0; r < board.length; r++){
			for(int c = 0; c < board[0].length; c++){
				int aliveNeighbours = getAliveNeighbours(board, r, c);
				if(board[r][c] == 0  && aliveNeighbours == 3){
					board[r][c] = 2;
				}else if(board[r][c] == 1 && (aliveNeighbours < 2 || aliveNeighbours > 3)){
						board[r][c] = 3;
				}
			}
		}
		
		for(int r = 0; r < board.length; r++){
			for(int c = 0; c < board[0].length; c++){
				board[r][c] = (board[r][c] == 3) ? 0 : (board[r][c] == 2) ? 1: board[r][c];
			}
		}
	}
	
	private int getAliveNeighbours(int board[][], int r, int c){
		int aliveNeighbours = 0;
		for(int i = (r-1 < 0 ? 0 : r-1); i <= (r+1 > board.length-1 ? board.length-1 : r+1) ; i++){
			for(int j = (c-1 < 0 ? 0 : c-1); j <= (c+1 > board[0].length -1 ? board[0].length -1 : c+1); j++){
				if(i == r && j == c) continue;
				if(board[i][j] == 1 || board[i][j] == 3) 
					aliveNeighbours++; 
			}
		}
		return aliveNeighbours;
	}

}