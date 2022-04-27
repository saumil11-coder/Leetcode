class Solution {
    public int diagonalSum(int[][] mat) {
        int sum=0, n = mat.length;
        for(int i=0; i<mat.length; i++){
            sum += mat[i][i];
        }
        for(int i=0; i<mat.length; i++){
            sum = sum + mat[i][n-1-i];
        }

        if(n % 2 != 0){
            sum -= mat[n/2][n/2];
        }
        
        return sum;
    }
}