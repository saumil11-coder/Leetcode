class Solution {
    public int[][] diagonalSort(int[][] mat) {
        //using countsort
        
        int m=mat.length;
        int n=mat[0].length;
        
        for(int i=0;i<m;i++){
            countsort(mat,i,0);
        }
        
        for(int j=1;j<n;j++){
            countsort(mat,0,j);
        }
        
        return mat;
    }
    
    public void countsort(int [][]mat, int i, int j){
        int []map=new int[101];
        int r=i;
        int c=j;
        
        int m=mat.length;
        int n=mat[0].length;
        
        while(r<m && c<n){
            map[mat[r][c]]++;
            r++;
            c++;
        }
        
        r=i;
        c=j;
        
        for(int k=1;k<101;k++){
            while(map[k]>0){
                mat[r][c]=k;
                map[k]--;
                r++;
                c++;
            }
        }
    }
}
