class Solution {
   public List<Integer> spiralOrder(int[][] matrix) {
List<Integer> list=new ArrayList<>();
int row=matrix.length;
int col =matrix[0].length;
if(row==0) return list;
 
int l=0,r=col-1,top=0,bottom=row-1,d=0;
while(l<=r&& top<=bottom)
{
if(d==0)
{
for(int i=l;i<=r;i++)
{
list.add(matrix[top][i]);

}


d=1; top=top+1;
} 
else if(d==1)
{
for(int i=top;i<=bottom;i++)
{
list.add(matrix[i][r]);

}

d=2;r-=1;
}
else if(d==2)
{
for(int i=r;i>=l;i--)
{
list.add(matrix[bottom][i]);


}

d=3;bottom--;
}
else if(d==3)
{
for(int i=bottom;i>=top;i--)
{
list.add(matrix[i][l]);
}


d=0;l++;
}
}
return list;

        
 }
}