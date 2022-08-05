class Solution:
    def solveNQueens(self, n: int) -> List[List[str]]:
        col=set()
        pos_dig=set()
        neg_dig=set()
        ans=[]
        board=[["."]*n for i in range(n)]
        
        def backtrack(r):
            if r==n:
                copy=["".join(row) for row in board]
                ans.append(copy)
            for c in range(n):
                if c in col or (r+c) in pos_dig or (r-c) in neg_dig:
                    continue
                col.add(c)
                pos_dig.add(r+c)
                neg_dig.add(r-c)
                board[r][c]="Q"
                
                backtrack(r+1)
                
                col.remove(c)
                pos_dig.remove(r+c)
                neg_dig.remove(r-c)
                board[r][c]="."
        backtrack(0)
        return ans
                
        
        '''col=set()
        posdig=set()#(r+c)
        negdig=set()#(r-c)
        res=[]
        board=[["."]*n for i in range(n)]
    #backtracking function
        def backtrack(r):
            if r==n:
                copy=["".join(row) for row in board]
                res.append(copy)
                return
            for c in range(n):
                if c in col or (r+c) in posdig or (r-c) in negdig:
                    continue
                
                col.add(c)
                posdig.add(r+c)
                negdig.add(r-c)
                board[r][c]="Q"
                
                backtrack(r+1)
                
                col.remove(c)
                posdig.remove(r+c)
                negdig.remove(r-c)
                board[r][c]="."
        backtrack(0)
        return res'''