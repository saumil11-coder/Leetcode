class Solution {
    public int[] numsSameConsecDiff(int n, int k) {
        ArrayList<Integer> list=new ArrayList<>();
        if(n==1)
            return new int[]{0,1,2,3,4,5,6,7,8,9};
        for(int i=1;i<=9;i++)
        {
            dfs(n,k,i,0,i,list);
        }
        int ans[]=new int[list.size()];
        for(int i=0;i<list.size();i++)
        
        {
            ans[i]=list.get(i);
        }
        return ans;
        
    }
    private void dfs(int n,int k,int curr,int i,int prev,ArrayList<Integer> res)
    {
        if(i==n-1)
        {
            res.add(curr);
            return ;
        }
        int next=prev+k;
        if(next<10){
            dfs(n,k,(curr*10)+next,i+1,next,res);}
        next=prev-k;
        if(k!=0 && next>=0)
        {
            dfs(n,k,(curr*10)+next,i+1,next,res);
        }
    }
}