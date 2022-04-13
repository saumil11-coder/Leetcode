class Solution {
    public int[][] generateMatrix(int n) {

 int matrix[][]=new int[n][n];
int l=0,r=n-1,top=0,bottom=n-1,d=0;
        int nums=1;
while(l<=r&& top<=bottom)
{
if(d==0)
{
for(int i=l;i<=r;i++)
{
matrix[top][i]=nums; nums++;

}


d=1; top=top+1;
} 
else if(d==1)
{
for(int i=top;i<=bottom;i++)
{
matrix[i][r]=nums; nums++;

}

d=2;r-=1;
}
else if(d==2)
{
for(int i=r;i>=l;i--)
{
matrix[bottom][i]=nums; nums++;


}

d=3;bottom--;
}
else if(d==3)
{
for(int i=bottom;i>=top;i--)
{
matrix[i][l]=nums;nums++;
}
d=0;l++;
}
}
return matrix;  
    }
}