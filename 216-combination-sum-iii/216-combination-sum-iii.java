class Solution {
    private void find(int idx,int k,int n,List<List<Integer>>ans,List<Integer>ds)
    {
        if(ds.size()==k&&n==0)
        {
            ans.add(new ArrayList<>(ds));
            return;
        }
        for(int i=idx;i<=9;i++)
        {
            ds.add(i);
            find(i+1,k,n-i,ans,ds);
            ds.remove(ds.size()-1);
        }
    }


    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> ans=new ArrayList<>();
        find(1,k,n,ans,new ArrayList<>());
        return ans;
        
    }
}
























































    // private void find(int idx,int candidates,int target,List<List<Integer>> ans ,List<Integer> ds)
// {
// if(ds.size()==candidates&& target==0)
// {
// ans.add(new ArrayList<>(ds));
// return;
// }

// for(int i=idx;i<=9;i++)
// {
// ds.add(i);
// find(i+1,candidates,target-i,ans,ds);
// ds.remove(ds.size()-1);
// }
// }